package com.company.project.service.impl;

import com.company.project.dao.FmFacilityMapViewMapper;
import com.company.project.model.FmFacilityMapView;
import com.company.project.service.FmFacilityMapViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class FmFacilityMapViewServiceImpl extends AbstractService<FmFacilityMapView> implements FmFacilityMapViewService {
    @Resource
    private FmFacilityMapViewMapper fmFacilityMapViewMapper;

}
