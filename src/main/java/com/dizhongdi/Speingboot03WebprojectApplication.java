package com.dizhongdi;

import com.dizhongdi.service.RegisterCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync    //开启异步任务支持
public class Speingboot03WebprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(Speingboot03WebprojectApplication.class, args);
    }
}
