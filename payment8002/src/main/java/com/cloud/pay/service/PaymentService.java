package com.cloud.pay.service;

import com.cloud.commons.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取

}
