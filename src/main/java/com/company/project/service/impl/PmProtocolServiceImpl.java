package com.company.project.service.impl;

import com.company.project.dao.PmProtocolMapper;
import com.company.project.model.PmProtocol;
import com.company.project.service.PmProtocolService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class PmProtocolServiceImpl extends AbstractService<PmProtocol> implements PmProtocolService {
    @Resource
    private PmProtocolMapper pmProtocolMapper;

}
