package com.company.project.model.view;

import com.company.project.model.Point;
import com.company.project.model.Role;

import java.util.List;

/**
 * @author 海龙
 * @description
 * @date 2019/4/17 23:39:43
 */
public class UserInfo {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String userName;
    /**
     *
     */
    private Role role;
    private List<Role> roleList;
    /**
     *
     */
    private List<Point> pointList;

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    /**
     * 获取用户角色列表
     * @return 角色列表
     */
    public List<Role> getRoleList() {
        return roleList;
    }

    /**
     * 设置用户角色列表
     * @param roleList 角色列表
     */
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    /**
     * 获取用户权限列表
     * @return 权限列表
     */
    public List<Point> getPointList() {
        return pointList;
    }

    /**
     * 设置用户权限列表
     * @param pointList 权限列表
     */
    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }
}
