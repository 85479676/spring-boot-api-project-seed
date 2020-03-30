package com.company.project.service.impl;

import com.company.project.dao.LogAlarmCurrentMapper;
import com.company.project.model.LogAlarmCurrent;
import com.company.project.service.LogAlarmCurrentService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/17.
 */
@Service
@Transactional
public class LogAlarmCurrentServiceImpl extends AbstractService<LogAlarmCurrent> implements LogAlarmCurrentService {
    @Resource
    private LogAlarmCurrentMapper logAlarmCurrentMapper;

}
