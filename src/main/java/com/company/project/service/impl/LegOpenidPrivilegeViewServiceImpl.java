package com.company.project.service.impl;

import com.company.project.dao.LegOpenidPrivilegeViewMapper;
import com.company.project.model.LegOpenidPrivilegeView;
import com.company.project.service.LegOpenidPrivilegeViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LegOpenidPrivilegeViewServiceImpl extends AbstractService<LegOpenidPrivilegeView> implements LegOpenidPrivilegeViewService {
    @Resource
    private LegOpenidPrivilegeViewMapper legOpenidPrivilegeViewMapper;

}
