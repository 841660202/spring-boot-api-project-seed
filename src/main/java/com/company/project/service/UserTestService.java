package com.company.project.service;
import com.company.project.model.UserTest;
import com.company.project.core.Service;
import com.company.project.model.view.UserInfo;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/04/14.
 */
public interface UserTestService extends Service<UserTest> {
     UserInfo getUserInfoById(Integer id);
}
