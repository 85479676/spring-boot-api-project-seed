package com.company.project.service.impl;

import com.company.project.dao.FmFacilityMapMarkerMapper;
import com.company.project.model.FmFacilityMapMarker;
import com.company.project.service.FmFacilityMapMarkerService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class FmFacilityMapMarkerServiceImpl extends AbstractService<FmFacilityMapMarker> implements FmFacilityMapMarkerService {
    @Resource
    private FmFacilityMapMarkerMapper fmFacilityMapMarkerMapper;

}
