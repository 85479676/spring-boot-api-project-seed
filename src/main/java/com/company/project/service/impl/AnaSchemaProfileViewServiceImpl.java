package com.company.project.service.impl;

import com.company.project.dao.AnaSchemaProfileViewMapper;
import com.company.project.model.AnaSchemaProfileView;
import com.company.project.service.AnaSchemaProfileViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/22.
 */
@Service
@Transactional
public class AnaSchemaProfileViewServiceImpl extends AbstractService<AnaSchemaProfileView> implements AnaSchemaProfileViewService {
    @Resource
    private AnaSchemaProfileViewMapper anaSchemaProfileViewMapper;

}
