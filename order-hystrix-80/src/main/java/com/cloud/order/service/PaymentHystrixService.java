package com.cloud.order.service;

import com.cloud.order.service.impl.PaymentHystrixServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: shj
 * @Date: 2020/07/12 17:57
 * @Description:
 */
@Component
@FeignClient(value = "PAYMENT-HYSTRIX",fallback = PaymentHystrixServiceFallBack.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
