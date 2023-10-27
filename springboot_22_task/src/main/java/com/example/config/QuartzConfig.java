package com.example.config;

import com.example.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail printJobDetail() {

        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

    @Bean
    public Trigger printJobTrigger() {

        ScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(schedBuilder).build();
    }
}
