package com.company.project.service.impl;

import com.company.project.dao.LegMenuMapper;
import com.company.project.model.LegMenu;
import com.company.project.service.LegMenuService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/27.
 */
@Service
@Transactional
public class LegMenuServiceImpl extends AbstractService<LegMenu> implements LegMenuService {
    @Resource
    private LegMenuMapper legMenuMapper;

}
