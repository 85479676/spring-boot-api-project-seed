package com.company.project.service.impl;

import com.company.project.dao.LogAlarmHistoryMapper;
import com.company.project.model.LogAlarmHistory;
import com.company.project.service.LogAlarmHistoryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/27.
 */
@Service
@Transactional
public class LogAlarmHistoryServiceImpl extends AbstractService<LogAlarmHistory> implements LogAlarmHistoryService {
    @Resource
    private LogAlarmHistoryMapper logAlarmHistoryMapper;

    @Override
    public List<LogAlarmHistory> selectCountOne(String unid, String datimeFrom, String datimeTo) {
        return logAlarmHistoryMapper.selectCountOne(unid, datimeFrom, datimeTo);
    }
}
