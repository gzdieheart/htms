package com.yixiuge.htms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.yixiuge.htms.domain")
public class HtmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtmsApplication.class, args);
    }

}
