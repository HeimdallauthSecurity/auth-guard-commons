package com.heimdallauth.authguard.common;

public enum UserStatus {
    ACTIVE,
    PROVISIONED,
    STAGED,
    LOCKED_OUT,
    PASSWORD_EXPIRED,
    RECOVERY,
    SUSPENDED,
    DEPROVISIONED
}
