package com.heimdallauth.authguard.dto.bifrost;

import com.heimdallauth.authguard.dto.kratos.UserProfileDTO;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SendTemporaryPassword {
    private UserProfileDTO userProfileDTO;
    private String temporaryPassword;
    private Instant temporaryPasswordExpiresAt;
}
