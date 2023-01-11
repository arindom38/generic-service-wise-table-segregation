package com.test.genericservicewisetable.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class CardPayment extends AbstractPaymentEntity{

    @NotNull
    private String cardNumber;
    @NotNull
    private String cardType;
}
