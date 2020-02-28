package com.company.project.service.impl;

import com.company.project.dao.MdModelViewMapper;
import com.company.project.model.MdModelView;
import com.company.project.service.MdModelViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class MdModelViewServiceImpl extends AbstractService<MdModelView> implements MdModelViewService {
    @Resource
    private MdModelViewMapper mdModelViewMapper;

}
