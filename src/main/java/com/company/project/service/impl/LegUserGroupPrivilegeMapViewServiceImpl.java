package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupPrivilegeMapViewMapper;
import com.company.project.model.LegUserGroupPrivilegeMapView;
import com.company.project.service.LegUserGroupPrivilegeMapViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegUserGroupPrivilegeMapViewServiceImpl extends AbstractService<LegUserGroupPrivilegeMapView> implements LegUserGroupPrivilegeMapViewService {
    @Resource
    private LegUserGroupPrivilegeMapViewMapper legUserGroupPrivilegeMapViewMapper;

}
