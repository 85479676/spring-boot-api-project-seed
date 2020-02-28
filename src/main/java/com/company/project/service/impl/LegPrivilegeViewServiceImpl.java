package com.company.project.service.impl;

import com.company.project.dao.LegPrivilegeViewMapper;
import com.company.project.model.LegPrivilegeView;
import com.company.project.service.LegPrivilegeViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class LegPrivilegeViewServiceImpl extends AbstractService<LegPrivilegeView> implements LegPrivilegeViewService {
    @Resource
    private LegPrivilegeViewMapper legPrivilegeViewMapper;

}
