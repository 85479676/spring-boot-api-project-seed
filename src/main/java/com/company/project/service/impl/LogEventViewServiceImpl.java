package com.company.project.service.impl;

import com.company.project.dao.LogEventViewMapper;
import com.company.project.model.LogEventView;
import com.company.project.service.LogEventViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class LogEventViewServiceImpl extends AbstractService<LogEventView> implements LogEventViewService {
    @Resource
    private LogEventViewMapper logEventViewMapper;

}
