package com.company.project.service;

import com.company.project.model.LogAlarmHistory;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/27.
 */
public interface LogAlarmHistoryService extends Service<LogAlarmHistory> {
    public List<LogAlarmHistory> selectCountOne(String unid, String datimeFrom, String datimeTo);

}
