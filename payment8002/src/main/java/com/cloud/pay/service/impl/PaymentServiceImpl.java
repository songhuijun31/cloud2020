package com.cloud.pay.service.impl;

import com.cloud.commons.entity.Payment;
import com.cloud.pay.mapper.PaymentMapper;
import com.cloud.pay.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    public int create(Payment payment){
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentMapper.getPaymentById(id);

    }

}
