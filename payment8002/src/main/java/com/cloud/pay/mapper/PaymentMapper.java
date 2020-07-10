package com.cloud.pay.mapper;


import com.cloud.commons.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PaymentMapper {
    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);
}
