package com.company.project.service.impl;

import com.company.project.dao.PmProtocolOrderMapper;
import com.company.project.model.PmProtocolOrder;
import com.company.project.service.PmProtocolOrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/03.
 */
@Service
@Transactional
public class PmProtocolOrderServiceImpl extends AbstractService<PmProtocolOrder> implements PmProtocolOrderService {
    @Resource
    private PmProtocolOrderMapper pmProtocolOrderMapper;

}