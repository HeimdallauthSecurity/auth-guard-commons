package com.heimdallauth.authguard.dto.kratos.password;

import lombok.*;

@Builder
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class PasswordAge {
    private int maxAge;
    private int showWarningWhenAgeLessThan;
    private int historyCount;
}
