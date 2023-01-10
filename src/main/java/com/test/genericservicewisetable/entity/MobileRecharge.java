package com.test.genericservicewisetable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MobileRecharge extends AbstractPaymentEntity{
    private String operatorType;
}
