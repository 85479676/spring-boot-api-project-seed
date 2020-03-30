package com.company.project.service.impl;

import com.company.project.dao.PaTaskViewMapper;
import com.company.project.model.PaTaskView;
import com.company.project.service.PaTaskViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/10.
 */
@Service
@Transactional
public class PaTaskViewServiceImpl extends AbstractService<PaTaskView> implements PaTaskViewService {
    @Resource
    private PaTaskViewMapper paTaskViewMapper;

}
