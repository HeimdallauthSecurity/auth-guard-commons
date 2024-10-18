package com.heimdallauth.authguard.dto.kratos;

import com.heimdallauth.authguard.common.UserStatus;
import com.heimdallauth.authguard.models.CredentialModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateUserProfileDTO {
    private String username;
    private String emailAddress;
    private UserStatus userStatus;
    private CredentialModel credentials;
}
