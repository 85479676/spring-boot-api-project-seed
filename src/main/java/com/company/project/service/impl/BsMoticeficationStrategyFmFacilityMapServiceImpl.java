package com.company.project.service.impl;

import com.company.project.dao.BsMoticeficationStrategyFmFacilityMapMapper;
import com.company.project.model.BsMoticeficationStrategyFmFacilityMap;
import com.company.project.service.BsMoticeficationStrategyFmFacilityMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/28.
 */
@Service
@Transactional
public class BsMoticeficationStrategyFmFacilityMapServiceImpl extends AbstractService<BsMoticeficationStrategyFmFacilityMap> implements BsMoticeficationStrategyFmFacilityMapService {
    @Resource
    private BsMoticeficationStrategyFmFacilityMapMapper bsMoticeficationStrategyFmFacilityMapMapper;

}
