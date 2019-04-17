package com.company.project.service.impl;

import com.company.project.dao.PointMapper;
import com.company.project.model.Point;
import com.company.project.service.PointService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by hail on 2019/04/17.
 */
@Service
@Transactional
public class PointServiceImpl extends AbstractService<Point> implements PointService {
    @Resource
    private PointMapper pointMapper;

}
