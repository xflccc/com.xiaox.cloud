package com.xiaoxu.provider.mapper;

import com.xiaoxu.api.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    public List<Payment> getList();
}
