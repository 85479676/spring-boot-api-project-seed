package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupDomainMapViewMapper;
import com.company.project.model.LegUserGroupDomainMapView;
import com.company.project.service.LegUserGroupDomainMapViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class LegUserGroupDomainMapViewServiceImpl extends AbstractService<LegUserGroupDomainMapView> implements LegUserGroupDomainMapViewService {
    @Resource
    private LegUserGroupDomainMapViewMapper legUserGroupDomainMapViewMapper;

}
