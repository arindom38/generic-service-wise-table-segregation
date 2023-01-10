package com.test.genericservicewisetable.controller;

import com.test.genericservicewisetable.entity.MobileRecharge;
import com.test.genericservicewisetable.entity.PayBill;
import com.test.genericservicewisetable.service.MobileRechargeService;
import com.test.genericservicewisetable.service.PayBillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PayBillService payBillService;
    private final MobileRechargeService mobileRechargeService;

    @PostMapping("service/pay-bill")
    public ResponseEntity savePayBill(@RequestBody PayBill payBill){
        return ResponseEntity.ok(payBillService.save(payBill));
    }

    @GetMapping("service/pay-bill")
    public List<PayBill> getAllPayBill(){
        return payBillService.findAll();
    }


    @PostMapping("service/mobile-recharge")
    public ResponseEntity saveMobileRecharge(@RequestBody MobileRecharge mobileRecharge){
        return ResponseEntity.ok(mobileRechargeService.save(mobileRecharge));
    }

    @GetMapping("service/mobile-recharges")
    public List<MobileRecharge> getAllMobileRecharges(){
        return mobileRechargeService.findAll();
    }
}
