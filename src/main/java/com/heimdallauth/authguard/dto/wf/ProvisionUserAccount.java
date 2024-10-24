package com.heimdallauth.authguard.dto.wf;

import com.heimdallauth.authguard.models.UserModel;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProvisionUserAccount {
    private UserModel userInfo;
    private List<String> requestedAccessCatalogIds;
}
