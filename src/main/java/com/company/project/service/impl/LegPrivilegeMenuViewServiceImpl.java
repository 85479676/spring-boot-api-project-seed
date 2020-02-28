package com.company.project.service.impl;

import com.company.project.dao.LegPrivilegeMenuViewMapper;
import com.company.project.model.LegPrivilegeMenuView;
import com.company.project.service.LegPrivilegeMenuViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/27.
 */
@Service
@Transactional
public class LegPrivilegeMenuViewServiceImpl extends AbstractService<LegPrivilegeMenuView> implements LegPrivilegeMenuViewService {
    @Resource
    private LegPrivilegeMenuViewMapper legPrivilegeMenuViewMapper;

}
