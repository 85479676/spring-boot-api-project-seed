package com.company.project.service.impl;

import com.company.project.dao.FmTodoPatrolViewMapper;
import com.company.project.model.FmTodoPatrolView;
import com.company.project.service.FmTodoPatrolViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
@Service
@Transactional
public class FmTodoPatrolViewServiceImpl extends AbstractService<FmTodoPatrolView> implements FmTodoPatrolViewService {
    @Resource
    private FmTodoPatrolViewMapper fmTodoPatrolViewMapper;

}
