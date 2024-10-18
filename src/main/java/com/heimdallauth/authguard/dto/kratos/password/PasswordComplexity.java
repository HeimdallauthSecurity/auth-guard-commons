package com.heimdallauth.authguard.dto.kratos.password;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PasswordComplexity {
    private int minLength;
    private int maxLength;
    private int minSymbols;
    private int minNumbers;
    private int minLowercase;
    private int minUppercase;
}
