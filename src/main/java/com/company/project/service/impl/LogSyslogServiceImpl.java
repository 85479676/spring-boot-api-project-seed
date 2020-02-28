package com.company.project.service.impl;

import com.company.project.dao.LogSyslogMapper;
import com.company.project.model.LogSyslog;
import com.company.project.service.LogSyslogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LogSyslogServiceImpl extends AbstractService<LogSyslog> implements LogSyslogService {
    @Resource
    private LogSyslogMapper logSyslogMapper;

}
