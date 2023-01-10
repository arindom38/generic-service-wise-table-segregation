package com.test.genericservicewisetable.entity;


import com.test.genericservicewisetable.enums.SubscriptionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Subscription extends BaseEntity {
    @NotNull
    private String subscriptionRequestId;

    @NotNull
    private Long requesterId;

    @NotNull
    private Long serviceId;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SubscriptionType subscriptionType;
}
