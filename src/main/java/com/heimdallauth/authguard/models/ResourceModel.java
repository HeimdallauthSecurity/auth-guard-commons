package com.heimdallauth.authguard.models;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResourceModel {
    private String resourceId;
    private String resourceName;
    private String resourceDescription;
    private boolean approvalRequired;
    private List<String> availableRoles;
    private int maxApprovalLevel;
}
