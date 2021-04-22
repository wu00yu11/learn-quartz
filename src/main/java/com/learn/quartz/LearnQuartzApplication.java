package com.learn.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.learn.quartz.dao"})
public class LearnQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnQuartzApplication.class, args);
    }

}
