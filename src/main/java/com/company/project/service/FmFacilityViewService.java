package com.company.project.service;
import com.company.project.core.Service;
import com.company.project.model.FmFacilityView;
import com.company.project.model.FmFacilityViews;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
public interface FmFacilityViewService extends Service<FmFacilityView> {
    public List<FmFacilityViews> getCount(String domainUnid);
}
