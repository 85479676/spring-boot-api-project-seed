package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupPrivilegeMapMapper;
import com.company.project.model.LegUserGroupPrivilegeMap;
import com.company.project.service.LegUserGroupPrivilegeMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegUserGroupPrivilegeMapServiceImpl extends AbstractService<LegUserGroupPrivilegeMap> implements LegUserGroupPrivilegeMapService {
    @Resource
    private LegUserGroupPrivilegeMapMapper legUserGroupPrivilegeMapMapper;

}
