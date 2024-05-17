package com.b301.moeum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MoeumApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoeumApplication.class, args);
    }

}
