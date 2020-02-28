package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.OauOpenId;
import org.springframework.data.repository.query.Param;


public interface OauOpenIdMapper extends Mapper<OauOpenId> {

    OauOpenId selectGetName(@Param("NAME") String name);

}