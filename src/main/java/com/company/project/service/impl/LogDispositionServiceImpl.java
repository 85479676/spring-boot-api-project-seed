package com.company.project.service.impl;

import com.company.project.dao.LogDispositionMapper;
import com.company.project.model.LogDisposition;
import com.company.project.service.LogDispositionService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/17.
 */
@Service
@Transactional
public class LogDispositionServiceImpl extends AbstractService<LogDisposition> implements LogDispositionService {
    @Resource
    private LogDispositionMapper logDispositionMapper;

}
