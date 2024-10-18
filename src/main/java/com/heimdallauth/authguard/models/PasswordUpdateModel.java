package com.heimdallauth.authguard.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PasswordUpdateModel {
    private String oldPassword;
    private String newPassword;
}
