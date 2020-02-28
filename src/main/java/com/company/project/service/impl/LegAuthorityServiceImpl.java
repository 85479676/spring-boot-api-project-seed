package com.company.project.service.impl;

import com.company.project.dao.LegAuthorityMapper;
import com.company.project.model.LegAuthority;
import com.company.project.service.LegAuthorityService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class LegAuthorityServiceImpl extends AbstractService<LegAuthority> implements LegAuthorityService {
    @Resource
    private LegAuthorityMapper legAuthorityMapper;

}
