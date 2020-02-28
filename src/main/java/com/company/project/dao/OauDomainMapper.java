package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.OauDomain;
import org.springframework.data.repository.query.Param;

public interface OauDomainMapper extends Mapper<OauDomain> {
    OauDomain selectGetName(@Param("NAME") String name);
}