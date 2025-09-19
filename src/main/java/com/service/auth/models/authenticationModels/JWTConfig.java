package com.service.auth.models.authenticationModels;

import lombok.Data;

@Data
public class JWTConfig {
    private String JWT_SECRET;
    private String JWT_EXPIRES_IN;
}
