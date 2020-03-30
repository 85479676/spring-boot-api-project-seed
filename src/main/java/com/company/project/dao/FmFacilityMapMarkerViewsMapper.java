package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.FmFacilityMapMarkerViews;

import java.util.List;

public interface FmFacilityMapMarkerViewsMapper extends Mapper<FmFacilityMapMarkerViews> {
    public List<FmFacilityMapMarkerViews> getAllFacility(String unid);
}