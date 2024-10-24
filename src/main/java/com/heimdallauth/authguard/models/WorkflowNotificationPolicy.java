package com.heimdallauth.authguard.models;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowNotificationPolicy {
    private List<String> onSubmission;
    private List<String> onApproval;
    private List<String> onRejection;
    private List<String> onEscalation;
}
