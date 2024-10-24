package com.heimdallauth.authguard.models;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowEscalationPolicy {
    private String timeLimit;
    private List<String> escalateTo;
    private boolean autoApprove;
}
