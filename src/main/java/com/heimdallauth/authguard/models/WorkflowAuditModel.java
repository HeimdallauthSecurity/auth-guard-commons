package com.heimdallauth.authguard.models;

import com.heimdallauth.authguard.common.WorkflowAuditAction;
import lombok.*;

import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowAuditModel {
    private String workflowId;
    private String workflowName;
    private String actionUserId;
    private String requestedByUserId;
    private WorkflowAuditAction action;
    private Instant timestamp;
    private String actionByUserId;
}
