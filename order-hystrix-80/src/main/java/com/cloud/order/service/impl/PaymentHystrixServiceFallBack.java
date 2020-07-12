package com.cloud.order.service.impl;

import com.cloud.order.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Auther: shj
 * @Date: 2020/07/12 18:15
 * @Description:
 */
@Component
public class PaymentHystrixServiceFallBack implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

}
