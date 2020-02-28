package com.company.project.service.impl;

import com.company.project.dao.LegOpenIdPrivilegeMapMapper;
import com.company.project.model.LegOpenIdPrivilegeMap;
import com.company.project.service.LegOpenIdPrivilegeMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegOpenIdPrivilegeMapServiceImpl extends AbstractService<LegOpenIdPrivilegeMap> implements LegOpenIdPrivilegeMapService {
    @Resource
    private LegOpenIdPrivilegeMapMapper legOpenIdPrivilegeMapMapper;

}
