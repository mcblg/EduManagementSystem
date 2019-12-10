package com.blg.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blg.edu.mapper")
public class EduManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduManagementSystemApplication.class, args);
    }

}
