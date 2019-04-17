package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.RolePoint;
import com.company.project.service.RolePointService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by hail on 2019/04/17.
*/
@RestController
@RequestMapping("/role/point")
public class RolePointController {
    @Resource
    private RolePointService rolePointService;

    @PostMapping("/add")
    public Result add(RolePoint rolePoint) {
        rolePointService.save(rolePoint);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        rolePointService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(RolePoint rolePoint) {
        rolePointService.update(rolePoint);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        RolePoint rolePoint = rolePointService.findById(id);
        return ResultGenerator.genSuccessResult(rolePoint);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RolePoint> list = rolePointService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
