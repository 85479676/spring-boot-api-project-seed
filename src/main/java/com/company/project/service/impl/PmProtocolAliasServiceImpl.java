package com.company.project.service.impl;

import com.company.project.dao.PmProtocolAliasMapper;
import com.company.project.model.PmProtocolAlias;
import com.company.project.service.PmProtocolAliasService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class PmProtocolAliasServiceImpl extends AbstractService<PmProtocolAlias> implements PmProtocolAliasService {
    @Resource
    private PmProtocolAliasMapper pmProtocolAliasMapper;

}
