package com.cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PayApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication8001.class,args);
    }
}
