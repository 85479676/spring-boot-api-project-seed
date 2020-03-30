package com.company.project.service.impl;

import com.company.project.dao.LogAlarmCurrentViewMapper;
import com.company.project.model.LogAlarmCurrentView;
import com.company.project.model.LogAlarmHistoryViews;
import com.company.project.service.LogAlarmCurrentViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/25.
 */
@Service
@Transactional
public class LogAlarmCurrentViewServiceImpl extends AbstractService<LogAlarmCurrentView> implements LogAlarmCurrentViewService {
    @Resource
    private LogAlarmCurrentViewMapper logAlarmCurrentViewMapper;

    @Override
    public List<LogAlarmHistoryViews> getCountAlarm(String domainUnid) {
        return logAlarmCurrentViewMapper.getCountAlarm(domainUnid);
    }
}
