package com.test.genericservicewisetable.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.NotNull;
import com.test.genericservicewisetable.enums.PaymentStatus;
import com.test.genericservicewisetable.utill.CustomLocalDateDeserializer;
import com.test.genericservicewisetable.utill.CustomLocalDateSerializer;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Payment extends AbstractPaymentEntity{

}
