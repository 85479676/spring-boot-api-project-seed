package com.company.project.service.impl;

import com.company.project.dao.LegPrivilegeMenuMapMapper;
import com.company.project.model.LegPrivilegeMenuMap;
import com.company.project.service.LegPrivilegeMenuMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegPrivilegeMenuMapServiceImpl extends AbstractService<LegPrivilegeMenuMap> implements LegPrivilegeMenuMapService {
    @Resource
    private LegPrivilegeMenuMapMapper legPrivilegeMenuMapMapper;

}
