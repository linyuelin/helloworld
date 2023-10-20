package com.example.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Component
@Data
@ConfigurationProperties(prefix = "servers")
//开启对当前bean属性的注入校验
@Validated
public class ServerConfig {
    private String idAddress;
    @Max(value = 8888,message = "最大值不超过8888")
    @Min(value = 202,message = "最小值不低于202")
    private int port;
    private long timeout;
}
