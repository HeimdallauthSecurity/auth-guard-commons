package com.heimdallauth.authguard.dto.bifrost;

import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WelcomeEmailRequest {
    private String username;
    private String firstName;
    private String lastName;
    private Instant signupTimestamp;
}
