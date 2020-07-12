package com.cloud.pay.service;

/**
 * @Auther: shj
 * @Date: 2020/07/12 17:42
 * @Description:
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id) throws InterruptedException;
}
