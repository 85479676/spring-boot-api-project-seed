package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.LegUserGroup;
import com.company.project.model.OauOpenId;
import org.springframework.data.repository.query.Param;

public interface LegUserGroupMapper extends Mapper<LegUserGroup> {
    LegUserGroup selectGetName(@Param("NAME") String name);
}