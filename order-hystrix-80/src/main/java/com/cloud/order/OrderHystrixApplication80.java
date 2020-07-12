package com.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: shj
 * @Date: 2020/07/12 17:55
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class OrderHystrixApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication80.class, args);
    }
}
