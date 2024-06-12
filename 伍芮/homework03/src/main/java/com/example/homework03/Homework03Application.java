package com.example.homework03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework03Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework03Application.class, args);
    }

}
@MapperScan(basePackages = "com.example.mybatisplus.mapper")
@SpringBootApplication
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}