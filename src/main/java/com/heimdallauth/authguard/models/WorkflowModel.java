package com.heimdallauth.authguard.models;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowModel {
    private String workflowId;
    private String workflowName;
    private List<String> stages;
    private WorkflowNotificationPolicy notificationPolicy;
}
