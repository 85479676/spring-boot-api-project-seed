package com.company.project.service.impl;

import com.company.project.dao.OauDomainMapper;
import com.company.project.model.OauDomain;
import com.company.project.service.OauDomainService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/14.
 */
@Service
@Transactional
public class OauDomainServiceImpl extends AbstractService<OauDomain> implements OauDomainService {
    @Resource
    private OauDomainMapper oauDomainMapper;


    @Override
    public OauDomain selectName(String domain_unid) {
        return oauDomainMapper.selectGetName(domain_unid);
    }
}
