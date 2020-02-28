package com.company.project.service.impl;

import com.company.project.dao.FmFacilityMapper;
import com.company.project.model.FmFacility;
import com.company.project.service.FmFacilityService;
import com.company.project.core.AbstractService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class FmFacilityServiceImpl extends AbstractService<FmFacility> implements FmFacilityService {
    @Resource
    private FmFacilityMapper fmFacilityMapper;

}
