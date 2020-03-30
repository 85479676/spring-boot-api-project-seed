package com.company.project.service.impl;

import com.company.project.dao.FmTodoPatrolMapper;
import com.company.project.model.FmTodoPatrol;
import com.company.project.model.FmTodoPatrols;
import com.company.project.service.FmTodoPatrolService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
@Service
@Transactional
public class FmTodoPatrolServiceImpl extends AbstractService<FmTodoPatrol> implements FmTodoPatrolService {
    @Resource
    private FmTodoPatrolMapper fmTodoPatrolMapper;

    @Override
    public List<FmTodoPatrols> getTodoPatrol(String domainUnid, String datimeFrom, String datimeTo) {
        return fmTodoPatrolMapper.getTodoPatrol(domainUnid, datimeFrom, datimeTo);
    }
}
