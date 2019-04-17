package com.company.project.service.impl;

import com.company.project.dao.UserRoleMapper;
import com.company.project.model.UserRole;
import com.company.project.service.UserRoleService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by hail on 2019/04/17.
 */
@Service
@Transactional
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

}
