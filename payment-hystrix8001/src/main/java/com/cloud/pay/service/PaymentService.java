package com.cloud.pay.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: shj
 * @Date: 2020/07/12 17:42
 * @Description:
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id) throws InterruptedException;

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
