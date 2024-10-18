package com.heimdallauth.authguard.dto.bifrost;

import com.heimdallauth.authguard.common.DeliveryMechanism;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NotificationResponse {
    private String identifier;
    private List<DeliveryMechanism> deliveryMechanisms;
    private Instant requestedOn;
    private Instant statusUpdatedOn;
}
