package com.company.project.service.impl;

import com.company.project.dao.RolePointMapper;
import com.company.project.model.RolePoint;
import com.company.project.service.RolePointService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by hail on 2019/04/17.
 */
@Service
@Transactional
public class RolePointServiceImpl extends AbstractService<RolePoint> implements RolePointService {
    @Resource
    private RolePointMapper rolePointMapper;

}
