package com.company.project.service.impl;

import com.company.project.dao.OauOpenIdMapper;
import com.company.project.model.OauOpenId;
import com.company.project.service.OauOpenIdService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/02/26.
 */
@Service
@Transactional
public class OauOpenIdServiceImpl extends AbstractService<OauOpenId> implements OauOpenIdService {
    @Resource
    private OauOpenIdMapper oauOpenIdMapper;


    @Override
    public OauOpenId selectByName(String name) {
        return oauOpenIdMapper.selectGetName(name);
    }
}
