package com.cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Auther: shj
 * @Date: 2020/07/12 17:38
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class,args);
    }

}
