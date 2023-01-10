package com.test.genericservicewisetable.service;

import com.test.genericservicewisetable.entity.MobileRecharge;
import com.test.genericservicewisetable.repository.MobileRechargeRepo;
import org.springframework.stereotype.Service;

@Service
public class MobileRechargeServiceImpl extends AbstractPaymentServiceImpl<MobileRecharge, Long> implements MobileRechargeService{
    private MobileRechargeRepo mobileRechargeRepo;
    public MobileRechargeServiceImpl(MobileRechargeRepo mobileRechargeRepo) {
        super(mobileRechargeRepo);
    }
}
