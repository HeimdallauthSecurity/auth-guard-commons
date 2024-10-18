package com.heimdallauth.authguard.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CredentialModel {
    private PasswordCreateModel newPassword;
    private PasswordUpdateModel updatePassword;
}
