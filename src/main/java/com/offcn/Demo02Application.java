package com.offcn;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.offcn.properties.CompanyProperties;
import com.offcn.properties.CourseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableDubbo
@SpringBootApplication
@EnableConfigurationProperties(
        {CompanyProperties.class, CourseProperties.class}
)
public class Demo02Application {
    public static  void  main(String[] args){
        SpringApplication.run(Demo02Application.class,args);
    }
}
