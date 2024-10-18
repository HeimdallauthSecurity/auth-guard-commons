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
    private String userProfileId;
    private String username;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String managerId;
    private Instant createdOn;
    private Instant updatedOn;
    private boolean isActive;
    private boolean isVendorAccount;
    private String vendorProfileId;
}
