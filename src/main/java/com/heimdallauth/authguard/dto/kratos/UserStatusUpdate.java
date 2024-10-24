package com.heimdallauth.authguard.dto.kratos;

import com.heimdallauth.authguard.common.UserStatus;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserStatusUpdate {
    private String id;
    private UserStatus updateUserStatus;
    private Instant delayedUpdateTimestamp;
    private boolean requirePasswordReset;
}
