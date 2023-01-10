package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.Payment;
import com.test.genericservicewisetable.repository.PaymentRepo;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends AbstractPaymentServiceImpl<Payment,Long> implements PaymentService{

    private PaymentRepo paymentRepo;
    public PaymentServiceImpl(PaymentRepo paymentRepo) {
        super(paymentRepo);
    }
}
