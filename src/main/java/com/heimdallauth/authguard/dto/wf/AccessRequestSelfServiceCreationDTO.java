package com.heimdallauth.authguard.dto.wf;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccessRequestSelfServiceCreationDTO {
    private String correlationId;
    private List<String> requestedAccessCatalogIds;
    private String comments;
}
