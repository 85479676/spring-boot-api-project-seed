package com.company.project.service.impl;

import com.company.project.dao.LegUserGroupDomainMapMapper;
import com.company.project.model.LegUserGroupDomainMap;
import com.company.project.service.LegUserGroupDomainMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegUserGroupDomainMapServiceImpl extends AbstractService<LegUserGroupDomainMap> implements LegUserGroupDomainMapService {
    @Resource
    private LegUserGroupDomainMapMapper legUserGroupDomainMapMapper;

}
