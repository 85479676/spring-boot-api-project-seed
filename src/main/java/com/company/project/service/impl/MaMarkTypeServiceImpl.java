package com.company.project.service.impl;

import com.company.project.dao.MaMarkTypeMapper;
import com.company.project.model.MaMarkType;
import com.company.project.service.MaMarkTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
@Service
@Transactional
public class MaMarkTypeServiceImpl extends AbstractService<MaMarkType> implements MaMarkTypeService {
    @Resource
    private MaMarkTypeMapper maMarkTypeMapper;

}
