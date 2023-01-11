package com.test.genericservicewisetable.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@Getter
@Setter
public class PointToPoint extends AbstractPaymentEntity{
    private String senderStatus;
}
