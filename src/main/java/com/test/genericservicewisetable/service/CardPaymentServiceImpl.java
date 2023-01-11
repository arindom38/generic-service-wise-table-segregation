package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.CardPayment;
import com.test.genericservicewisetable.repository.CardPaymentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardPaymentServiceImpl extends AbstractPaymentServiceImpl<CardPayment,Long> implements CardPaymentService{

    private  CardPaymentRepo cardPaymentRepo;

    public CardPaymentServiceImpl(CardPaymentRepo cardPaymentRepo) {
        super(cardPaymentRepo);
    }

    @Override
    public List<CardPayment> findAllCardsByType(String type) {
        return cardPaymentRepo.findAllByCardType(type);
    }
}