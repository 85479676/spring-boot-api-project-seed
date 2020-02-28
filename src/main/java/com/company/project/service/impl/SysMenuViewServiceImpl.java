package com.company.project.service.impl;

import com.company.project.dao.SysMenuViewMapper;
import com.company.project.model.SysMenuView;
import com.company.project.service.SysMenuViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/17.
 */
@Service
@Transactional
public class SysMenuViewServiceImpl extends AbstractService<SysMenuView> implements SysMenuViewService {
    @Resource
    private SysMenuViewMapper sysMenuViewMapper;



}
