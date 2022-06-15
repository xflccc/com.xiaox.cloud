package com.xiaoxu.provider.service.impl;

import com.xiaoxu.api.entities.Payment;
import com.xiaoxu.provider.mapper.PaymentDao;
import com.xiaoxu.provider.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> getList() {
        return paymentDao.getList();
    }
}
