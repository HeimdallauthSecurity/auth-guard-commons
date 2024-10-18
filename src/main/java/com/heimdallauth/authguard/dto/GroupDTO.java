package com.heimdallauth.authguard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupDTO {
    private String groupId;
    private String tenantId;
    private String groupName;
    private String groupDescription;
}
