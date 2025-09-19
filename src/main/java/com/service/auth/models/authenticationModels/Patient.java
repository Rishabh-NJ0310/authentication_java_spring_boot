package com.service.auth.models.authenticationModels;

import lombok.Data;

import java.util.List;

@Data
public class Patient extends AuthModel{
    private List<String> pIds;
    final private EAppType appType = EAppType.ME;
}
