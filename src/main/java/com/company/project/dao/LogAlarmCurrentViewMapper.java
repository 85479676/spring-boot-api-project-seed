package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.LogAlarmCurrentView;
import com.company.project.model.LogAlarmHistoryViews;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LogAlarmCurrentViewMapper extends Mapper<LogAlarmCurrentView> {
    public List<LogAlarmHistoryViews> getCountAlarm(@Param("domainUnid") String domainUnid);
}