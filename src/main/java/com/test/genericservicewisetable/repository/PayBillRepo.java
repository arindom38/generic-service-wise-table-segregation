package com.test.genericservicewisetable.repository;

import com.test.genericservicewisetable.entity.PayBill;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PayBillRepo extends AbstractPaymentRepo<PayBill,Long>{

    List<PayBill> findAllByPaymentType(String type);

}
