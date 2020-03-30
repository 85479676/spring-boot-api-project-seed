package com.company.project.service.impl;

import com.company.project.dao.PmProtocolFmFacilityViewMapper;
import com.company.project.model.PmProtocolFmFacilityView;
import com.company.project.service.PmProtocolFmFacilityViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PmProtocolFmFacilityViewServiceImpl extends AbstractService<PmProtocolFmFacilityView> implements PmProtocolFmFacilityViewService {
    @Resource
    private PmProtocolFmFacilityViewMapper pmProtocolFmFacilityViewMapper;

}
