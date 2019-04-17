package com.company.project.model;

import javax.persistence.*;

public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限点名
     */
    @Column(name = "point_name")
    private String pointName;

    /**
     * 权限点code
     */
    @Column(name = "point_code")
    private String pointCode;

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
     * 获取权限点名
     *
     * @return point_name - 权限点名
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * 设置权限点名
     *
     * @param pointName 权限点名
     */
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    /**
     * 获取权限点code
     *
     * @return point_code - 权限点code
     */
    public String getPointCode() {
        return pointCode;
    }

    /**
     * 设置权限点code
     *
     * @param pointCode 权限点code
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }
}