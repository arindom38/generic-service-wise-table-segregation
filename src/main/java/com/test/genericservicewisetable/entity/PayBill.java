package com.test.genericservicewisetable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class PayBill extends AbstractPaymentEntity{

    private String paymentType;

}
