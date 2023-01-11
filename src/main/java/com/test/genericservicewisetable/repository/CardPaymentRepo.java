package com.test.genericservicewisetable.repository;

import com.test.genericservicewisetable.entity.CardPayment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardPaymentRepo extends AbstractPaymentRepo<CardPayment,Long>{

    List<CardPayment> findAllByCardType(String type);

}
