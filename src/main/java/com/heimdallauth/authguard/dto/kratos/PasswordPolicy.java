package com.heimdallauth.authguard.dto.kratos;

import com.heimdallauth.authguard.dto.kratos.password.PasswordAge;
import com.heimdallauth.authguard.dto.kratos.password.PasswordComplexity;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PasswordPolicy {
    private PasswordComplexity complexity;
    private PasswordAge age;
    private Instant createdOn;
    private Instant updatedOn;
}
