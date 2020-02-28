package com.company.project.service.impl;

import com.company.project.dao.LegPrivilegeMapper;
import com.company.project.model.LegPrivilege;
import com.company.project.service.LegPrivilegeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class LegPrivilegeServiceImpl extends AbstractService<LegPrivilege> implements LegPrivilegeService {
    @Resource
    private LegPrivilegeMapper legPrivilegeMapper;


}
