package com.test.genericservicewisetable.repository;

import com.test.genericservicewisetable.entity.MobileRecharge;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MobileRechargeRepo extends AbstractPaymentRepo<MobileRecharge,Long> {
    List<MobileRecharge> findAllByOperatorType(String status);
}