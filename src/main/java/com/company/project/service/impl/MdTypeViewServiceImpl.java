package com.company.project.service.impl;

import com.company.project.dao.MdTypeViewMapper;
import com.company.project.model.MdTypeView;
import com.company.project.service.MdTypeViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/10.
 */
@Service
@Transactional
public class MdTypeViewServiceImpl extends AbstractService<MdTypeView> implements MdTypeViewService {
    @Resource
    private MdTypeViewMapper mdTypeViewMapper;

}
