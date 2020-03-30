package com.company.project.service;

import com.company.project.model.FmFacilityMapMarkerViews;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
public interface FmFacilityMapMarkerViewsService extends Service<FmFacilityMapMarkerViews> {
    public List<FmFacilityMapMarkerViews> getAllFacility(String unid);

}
