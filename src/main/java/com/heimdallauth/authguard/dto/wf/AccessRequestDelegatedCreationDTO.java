package com.heimdallauth.authguard.dto.wf;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccessRequestDelegatedCreationDTO {
    private String requestedFor;
    private List<String> requestedAccessCatalogIds;
}
