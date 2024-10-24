package com.heimdallauth.authguard.dto.kratos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateWorkforceUserProfile {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean requireEmailAddress;
    private List<String> groups;
    private List<String> roles;
    private Instant delayedActivationTimestamp;
    private boolean requirePasswordReset;
}
