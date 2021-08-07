package com.dizhongdi;


import com.dizhongdi.service.RegisterCodeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Speingboot03WebprojectApplicationTests {

    @Autowired
    RegisterCodeServiceImpl codeService;
    @Test
    void contextLoads() {
        String s = codeService.sendEmailCode("1556035287@qq.com");
        System.out.println(s);


    }

}
