package com.carstop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.carstop.mapper")
public class CarStopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarStopApplication.class, args);
    }

}
