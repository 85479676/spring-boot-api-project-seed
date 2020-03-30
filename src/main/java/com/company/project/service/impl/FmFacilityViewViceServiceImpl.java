package com.company.project.service.impl;

import com.company.project.dao.FmFacilityViewViceMapper;
import com.company.project.model.FmFacilityViewVice;
import com.company.project.service.FmFacilityViewViceService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/21.
 */
@Service
@Transactional
public class FmFacilityViewViceServiceImpl extends AbstractService<FmFacilityViewVice> implements FmFacilityViewViceService {
    @Resource
    private FmFacilityViewViceMapper fmFacilityViewViceMapper;

}
