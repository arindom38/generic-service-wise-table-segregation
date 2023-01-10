package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.PayBill;
import com.test.genericservicewisetable.repository.AbstractPaymentRepo;
import com.test.genericservicewisetable.repository.PayBillRepo;
import org.springframework.stereotype.Service;

@Service
public class PayBillServiceImpl extends AbstractPaymentServiceImpl<PayBill,Long> implements PayBillService{

    private  PayBillRepo payBillRepo;

    public PayBillServiceImpl(PayBillRepo payBillRepo) {
        super(payBillRepo);
    }
}
