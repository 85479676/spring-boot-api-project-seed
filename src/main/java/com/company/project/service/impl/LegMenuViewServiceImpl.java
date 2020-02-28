package com.company.project.service.impl;

import com.company.project.dao.LegMenuViewMapper;
import com.company.project.model.LegMenuView;
import com.company.project.service.LegMenuViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/27.
 */
@Service
@Transactional
public class LegMenuViewServiceImpl extends AbstractService<LegMenuView> implements LegMenuViewService {
    @Resource
    private LegMenuViewMapper legMenuViewMapper;

}
