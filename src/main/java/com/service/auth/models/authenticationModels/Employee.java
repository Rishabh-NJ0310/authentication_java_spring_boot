package com.service.auth.models.authenticationModels;

import lombok.Data;

@Data
public class Employee extends AuthModel{
    private String empId;
    private EAppType appType;
}
