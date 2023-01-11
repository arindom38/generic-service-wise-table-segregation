package com.test.genericservicewisetable.controller;

import com.test.genericservicewisetable.entity.CardPayment;
import com.test.genericservicewisetable.entity.PointToPoint;
import com.test.genericservicewisetable.service.CardPaymentService;
import com.test.genericservicewisetable.service.PointToPointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PointToPointService pointToPointService;

    private final CardPaymentService cardPaymentService;

    @PostMapping("service/p2p")
    public ResponseEntity savePayBill(@RequestBody PointToPoint PointToPoint){
        return ResponseEntity.ok(pointToPointService.save(PointToPoint));
    }

    @GetMapping("service/p2ps")
    public List<PointToPoint> getAllP2PPayments(){
        return pointToPointService.findAll();
    }


    @PostMapping("service/card-payment")
    public ResponseEntity saveCardPayment(@RequestBody CardPayment cardPayment){
        return ResponseEntity.ok(cardPaymentService.save(cardPayment));
    }

    @GetMapping("service/card-payments")
    public List<CardPayment> getAllCardPayments(){
        return cardPaymentService.findAll();
    }

    @GetMapping("service/card-payment/{cardType}")
    public List<CardPayment> getAllCardPaymentByType(@PathVariable String cardType){
        return cardPaymentService.findAllCardsByType(cardType);
    }
}
