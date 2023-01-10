package com.test.genericservicewisetable.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.NotNull;
import com.test.genericservicewisetable.enums.PaymentStatus;
import com.test.genericservicewisetable.utill.CustomLocalDateDeserializer;
import com.test.genericservicewisetable.utill.CustomLocalDateSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass
public class AbstractPaymentEntity extends BaseEntity{

    @NotNull
    private Long subscriptionId;

    private Boolean firstPayment;

    @NotNull
    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate dueDate;

    @NotNull
    private BigDecimal amount;

    private String trxId;


    private LocalDateTime trxTime;

    private String reverseTrxId;


    private LocalDateTime reverseTrxTime;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate executionDate;

    private BigDecimal reverseTrxAmount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @Column(columnDefinition = "text")
    private String reason;

}
