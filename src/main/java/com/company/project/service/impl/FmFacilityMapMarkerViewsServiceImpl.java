package com.company.project.service.impl;

import com.company.project.dao.FmFacilityMapMarkerViewsMapper;
import com.company.project.model.FmFacilityMapMarkerViews;
import com.company.project.service.FmFacilityMapMarkerViewsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class FmFacilityMapMarkerViewsServiceImpl extends AbstractService<FmFacilityMapMarkerViews> implements FmFacilityMapMarkerViewsService {
    @Resource
    private FmFacilityMapMarkerViewsMapper fmFacilityMapMarkerViewsMapper;


    @Override
    public List<FmFacilityMapMarkerViews> getAllFacility(String unid) {
        return fmFacilityMapMarkerViewsMapper.getAllFacility(unid);
    }
}
