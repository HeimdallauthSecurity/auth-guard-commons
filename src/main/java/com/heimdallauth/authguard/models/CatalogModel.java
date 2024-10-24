package com.heimdallauth.authguard.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CatalogModel {
    private String catalogId;
    private String accessName;
    private String accessDescription;

}
