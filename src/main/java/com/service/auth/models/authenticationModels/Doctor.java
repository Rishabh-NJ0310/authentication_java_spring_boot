package com.service.auth.models.authenticationModels;

import lombok.Data;

@Data
public class Doctor extends AuthModel{
    private String doctorUsername;
    final private EAppType appType = EAppType.DOCAPP;
}
