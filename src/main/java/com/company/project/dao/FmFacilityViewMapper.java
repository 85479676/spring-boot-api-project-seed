package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.FmFacilityView;
import com.company.project.model.FmFacilityViews;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FmFacilityViewMapper extends Mapper<FmFacilityView> {

    public List<FmFacilityViews> getCount(@Param("domainUnid") String domainUnid);
}