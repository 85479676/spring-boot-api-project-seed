package com.company.project.service.impl;

import com.company.project.dao.PmProtocolOrderViewMapper;
import com.company.project.model.PmProtocolOrderView;
import com.company.project.service.PmProtocolOrderViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PmProtocolOrderViewServiceImpl extends AbstractService<PmProtocolOrderView> implements PmProtocolOrderViewService {
    @Resource
    private PmProtocolOrderViewMapper pmProtocolOrderViewMapper;

}
