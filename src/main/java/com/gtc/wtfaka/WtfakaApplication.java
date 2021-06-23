package com.gtc.wtfaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.gtc.wtfaka.mapper")
public class WtfakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtfakaApplication.class, args);
    }

}
