package com.heimdallauth.authguard.dto.bifrost;

import com.heimdallauth.authguard.dto.kratos.UserProfileDTO;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CredentialResetLink {
    private String userEmailAddress;
    private UserProfileDTO userProfile;
    private String resetLink;
    private Instant requestedOn;
    private Instant expiresOn;
}
