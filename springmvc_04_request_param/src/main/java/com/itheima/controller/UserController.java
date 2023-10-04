package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
//请求参数
@Controller
public class UserController {

    //普通参数：请求参数与形参名称对应即可完成参数传递
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("一般の引数 name ==>" +name);
        System.out.println("一般の引数 age ==>" +age);
        return "{'module':'common param'}";
    }

    //普通参数：请求参数名与形参名不同时，使用@RequestParam注解关联请求参数名称与形参名称之间的关系
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName,int age){
        System.out.println("一般の引数 name ==>" +userName);
        System.out.println("一般の引数 age ==>" +age);
        return "{'module':'common param different name '}";
    }

    //POJO参数：请求参数与形参对象中的属性对应即可完成参数传递
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo引数の伝送　user ==>" +user);
        return "{'module':'pojo param'}";
    }

    //嵌套POJO参数：嵌套属性按照层次结构设定名称即可完成参数传递
    @RequestMapping("/pojoContainParam")
    @ResponseBody
    public String pojoContainParam(User user){
        System.out.println("pojoネストpojo引数の伝送　user ==>" +user);
        return "{'module':'pojo param'}";
    }

    //数组参数：同名请求参数可以直接映射到对应名称的形参数组对象中
    @RequestMapping("/arrayParam")
    @ResponseBody
     public String arrayParam(String [] likes){
         System.out.println("アレイの引数の伝送 likes ==>" + Arrays.toString(likes));
         return "{'module':'array param'}";
     }

    //集合参数：同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合の引数の伝送 likes ==>" + likes);
        return "{'module':'list param'}";
    }

    //集合参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数组数据映射到形参的集合对象中作为数据
    @RequestMapping("/listParamForJson")
    @ResponseBody
     public String listParamForJson(@RequestBody List<String> likes){
         System.out.println("list common(json)引数伝送" +likes );
         return "{'module':'pojo for json param'}";

     }

    //POJO参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数据映射到形参的实体类对象中，要求属性名称一一对应
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json)引数の伝送　user ==>" +user);
        return "{'module':'pojo param'}";
    }


    //集合参数：json格式
    //1.开启json数据格式的自动转换，在配置类中开启@EnableWebMvc
    //2.使用@RequestBody注解将外部传递的json数组数据映射到形参的保存实体类对象的集合对象中，要求属性名称一一对应
    @RequestMapping("/pojoListParamForJson")
    @ResponseBody
     public String listPojoParamForJson( @RequestBody List<User> list){
         System.out.println(list);
         return "{'module':'list pojo for json param'}";
     }

    //日期参数
    //使用@DateTimeFormat注解设置日期类型数据格式，默认格式yyyy/MM/dd

    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-mm-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/mm/dd hh:mm:ss") Date date2){
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        return "{'module':'data param'}";
    }

}











