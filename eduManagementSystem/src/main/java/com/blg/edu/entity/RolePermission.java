package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class RolePermission {
    private String id;

    private String roleId;

    private String permissionId;

    public RolePermission() {
    }

    public RolePermission(String roleId, String permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
}