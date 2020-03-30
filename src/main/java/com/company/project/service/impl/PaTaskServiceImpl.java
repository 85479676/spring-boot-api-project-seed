package com.company.project.service.impl;

import com.company.project.dao.PaTaskMapper;
import com.company.project.model.PaTask;
import com.company.project.service.PaTaskService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PaTaskServiceImpl extends AbstractService<PaTask> implements PaTaskService {
    @Resource
    private PaTaskMapper paTaskMapper;

}
