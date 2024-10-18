package com.heimdallauth.authguard.dto;

import com.heimdallauth.authguard.common.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserProfileDTO {
    private String userId;
    private String login;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String profileImageUrl;
    private Instant createdOn;
    private Instant updatedOn;
    private Instant lastLoginTimestamp;
    private UserStatus status;
}
