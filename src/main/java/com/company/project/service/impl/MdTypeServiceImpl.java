package com.company.project.service.impl;

import com.company.project.dao.MdTypeMapper;
import com.company.project.model.MdType;
import com.company.project.service.MdTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/20.
 */
@Service
@Transactional
public class MdTypeServiceImpl extends AbstractService<MdType> implements MdTypeService {
    @Resource
    private MdTypeMapper mdTypeMapper;

}
