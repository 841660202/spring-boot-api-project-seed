package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.UserTest;
import com.company.project.model.view.UserInfo;

import java.util.List;

public interface UserTestMapper extends Mapper<UserTest> {
    /**
     * 获取含有角色权限的用户信息
     * @param id 用户的ID
     * @return UserInfo
     */
    UserInfo getUserInfoById(Integer id);
}