package com.company.project.service.impl;

import com.company.project.core.AbstractService;
import com.company.project.dao.FmFacilityViewMapper;
import com.company.project.model.FmFacilityView;
import com.company.project.model.FmFacilityViews;
import com.company.project.service.FmFacilityViewService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class FmFacilityViewServiceImpl extends AbstractService<FmFacilityView> implements FmFacilityViewService {
    @Resource
    private FmFacilityViewMapper fmFacilityViewMapper;


    @Override
    public List<FmFacilityViews> getCount(String domainUnid) {
        return fmFacilityViewMapper.getCount(domainUnid);
    }
}
