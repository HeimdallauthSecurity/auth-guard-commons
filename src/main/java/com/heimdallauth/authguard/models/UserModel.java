package com.heimdallauth.authguard.models;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserModel {
    private String username;
    private String userFirstName;
    private String userLastName;
    private Boolean provisionEmailAddress;
    private String emailAddress;
    private String imageUrl;
    private String phoneNumber;
}
