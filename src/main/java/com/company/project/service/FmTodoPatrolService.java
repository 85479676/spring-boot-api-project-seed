package com.company.project.service;

import com.company.project.model.FmTodoPatrol;
import com.company.project.core.Service;
import com.company.project.model.FmTodoPatrols;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
public interface FmTodoPatrolService extends Service<FmTodoPatrol> {
    public List<FmTodoPatrols> getTodoPatrol(@Param("domainUnid") String domainUnid, @Param("datimeFrom") String datimeFrom, @Param("datimeTo") String datimeTo);

}
