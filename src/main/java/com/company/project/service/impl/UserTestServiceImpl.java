package com.company.project.service.impl;

import com.company.project.dao.UserTestMapper;
import com.company.project.model.UserTest;
import com.company.project.service.UserTestService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2019/04/14.
 */
@Service
@Transactional
public class UserTestServiceImpl extends AbstractService<UserTest> implements UserTestService {
    @Resource
    private UserTestMapper userTestMapper;

    @Override
    public List<UserTest> findAll(){
        return userTestMapper.findAll();
    }
}
