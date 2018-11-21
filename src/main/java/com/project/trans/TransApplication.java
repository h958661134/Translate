package com.project.trans;

import com.project.trans.Controller.DbController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.project.trans.Mapper"})
public class TransApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransApplication.class, args);
    }
}
