package com.company.project.service;

import com.company.project.model.LegUserGroup;
import com.company.project.core.Service;
import com.company.project.model.OauOpenId;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
public interface LegUserGroupService extends Service<LegUserGroup> {
    LegUserGroup selectByName(String name);

}
