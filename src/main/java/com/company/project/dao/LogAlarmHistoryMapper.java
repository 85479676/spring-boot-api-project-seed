package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.LogAlarmHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogAlarmHistoryMapper extends Mapper<LogAlarmHistory> {
   public List<LogAlarmHistory> selectCountOne(@Param("unid") String unid,@Param("datimeFrom") String datimeFrom,@Param("datimeTo") String datimeTo);
}