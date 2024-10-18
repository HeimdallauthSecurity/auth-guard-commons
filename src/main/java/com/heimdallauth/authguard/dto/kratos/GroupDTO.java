package com.heimdallauth.authguard.dto.kratos;

import com.heimdallauth.authguard.common.GroupStatus;
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
   private String groupName;
   private String groupDescription;
   private GroupStatus status;
}
