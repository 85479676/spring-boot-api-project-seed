package com.company.project.service.impl;

import com.company.project.dao.LegOpenidViewMapper;
import com.company.project.model.LegOpenidView;
import com.company.project.service.LegOpenidViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/26.
 */
@Service
@Transactional
public class LegOpenidViewServiceImpl extends AbstractService<LegOpenidView> implements LegOpenidViewService {
    @Resource
    private LegOpenidViewMapper legOpenidViewMapper;

}
