package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.LogAlarmHistoryViewMapper;
import com.company.project.model.LogAlarmHistoryView;
import com.company.project.service.LogAlarmHistoryViewService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/13.
 */
@Service
@Transactional
public class LogAlarmHistoryViewServiceImpl extends AbstractService<LogAlarmHistoryView> implements LogAlarmHistoryViewService {
    @Resource
    private LogAlarmHistoryViewMapper logAlarmHistoryViewMapper;


}
