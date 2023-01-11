package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.CardPayment;

import java.util.List;

public interface CardPaymentService extends AbstractPaymentService<CardPayment,Long>{
    List<CardPayment> findAllCardsByType(String type);
}
