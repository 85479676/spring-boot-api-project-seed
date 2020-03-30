package com.company.project.service.impl;

import com.company.project.dao.FmFacilityMapMarkerViewMapper;
import com.company.project.model.FmFacilityMapMarkerView;
import com.company.project.service.FmFacilityMapMarkerViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class FmFacilityMapMarkerViewServiceImpl extends AbstractService<FmFacilityMapMarkerView> implements FmFacilityMapMarkerViewService {
    @Resource
    private FmFacilityMapMarkerViewMapper fmFacilityMapMarkerViewMapper;

}
