package com.company.project.model;

import javax.persistence.*;

@Table(name = "role_point")
public class RolePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限点ID
     */
    @Column(name = "point_id")
    private Integer pointId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限点ID
     *
     * @return point_id - 权限点ID
     */
    public Integer getPointId() {
        return pointId;
    }

    /**
     * 设置权限点ID
     *
     * @param pointId 权限点ID
     */
    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }
}