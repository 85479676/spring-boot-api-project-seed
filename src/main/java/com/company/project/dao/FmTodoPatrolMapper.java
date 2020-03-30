package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.FmTodoPatrol;
import com.company.project.model.FmTodoPatrols;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FmTodoPatrolMapper extends Mapper<FmTodoPatrol> {
    public List<FmTodoPatrols> getTodoPatrol(@Param("domainUnid") String domainUnid, @Param("datimeFrom") String datimeFrom, @Param("datimeTo") String datimeTo);
}