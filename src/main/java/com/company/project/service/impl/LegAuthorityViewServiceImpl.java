package com.company.project.service.impl;

import com.company.project.dao.LegAuthorityViewMapper;
import com.company.project.model.LegAuthorityView;
import com.company.project.service.LegAuthorityViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class LegAuthorityViewServiceImpl extends AbstractService<LegAuthorityView> implements LegAuthorityViewService {
    @Resource
    private LegAuthorityViewMapper legAuthorityViewMapper;

}
