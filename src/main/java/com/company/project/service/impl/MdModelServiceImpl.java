package com.company.project.service.impl;

import com.company.project.dao.MdModelMapper;
import com.company.project.model.MdModel;
import com.company.project.service.MdModelService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class MdModelServiceImpl extends AbstractService<MdModel> implements MdModelService {
    @Resource
    private MdModelMapper mdModelMapper;

}
