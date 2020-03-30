package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupPrivilegeMapMenuViewMapper;
import com.company.project.model.LegUserGroupPrivilegeMapMenuView;
import com.company.project.service.LegUserGroupPrivilegeMapMenuViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/25.
 */
@Service
@Transactional
public class LegUserGroupPrivilegeMapMenuViewServiceImpl extends AbstractService<LegUserGroupPrivilegeMapMenuView> implements LegUserGroupPrivilegeMapMenuViewService {
    @Resource
    private LegUserGroupPrivilegeMapMenuViewMapper legUserGroupPrivilegeMapMenuViewMapper;

}
