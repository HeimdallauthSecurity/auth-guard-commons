package com.heimdallauth.authguard.dto;

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
    private String username;
    private String userFirstname;
    private String userLastName;
    private String emailAddress;
    private String phoneNumber;
    private String avatarUrl;
    private Instant dateOfBirth;
    private Instant createdOn;
    private Instant updatedOn;
}
