package com.xiaoxu.provider.service;

import com.xiaoxu.provider.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    public List<Payment> getList();
}
