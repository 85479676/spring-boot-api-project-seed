package com.company.project.service;

import com.company.project.core.Service;
import com.company.project.model.LogAlarmCurrentView;
import com.company.project.model.LogAlarmHistoryViews;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/25.
 */
public interface LogAlarmCurrentViewService extends Service<LogAlarmCurrentView> {
    public List<LogAlarmHistoryViews> getCountAlarm(String domainUnid);
}
