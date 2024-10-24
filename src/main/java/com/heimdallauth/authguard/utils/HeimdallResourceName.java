package com.heimdallauth.authguard.utils;

import com.heimdallauth.authguard.common.Partition;
import com.heimdallauth.authguard.common.Service;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class HeimdallResourceName {
    public static final String HRN_PREFIX = "hrn";
    public static final String HRN_DELIMITER = ":";

    private Partition partition;
    private Service service;
    private String organizationId;
    private String objectType;
    private String objectId;
    private String containedResource;

    public HeimdallResourceName(String hrn) {
        String[] parts = hrn.split(HRN_DELIMITER);
        if (parts.length != 7 || !HRN_PREFIX.equals(parts[0])) {
            throw new IllegalArgumentException("Invalid HRN format");
        }
        this.partition = Partition.valueOf(parts[1]);
        this.service = Service.valueOf(parts[2]);
        this.organizationId = parts[3];
        this.objectType = parts[4];
        this.objectId = parts[5];
        this.containedResource = parts[6];
    }

}
