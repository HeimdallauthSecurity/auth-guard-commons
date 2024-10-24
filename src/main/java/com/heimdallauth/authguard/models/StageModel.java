package com.heimdallauth.authguard.models;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StageModel {
    private String stageId;
    private String stageName;
    private List<String> approvers;
    private WorkflowEscalationPolicy escalationPolicy;
}
