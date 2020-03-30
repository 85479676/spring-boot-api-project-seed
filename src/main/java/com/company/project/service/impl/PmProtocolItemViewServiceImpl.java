package com.company.project.service.impl;

import com.company.project.dao.PmProtocolItemViewMapper;
import com.company.project.model.PmProtocolItemView;
import com.company.project.service.PmProtocolItemViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class PmProtocolItemViewServiceImpl extends AbstractService<PmProtocolItemView> implements PmProtocolItemViewService {
    @Resource
    private PmProtocolItemViewMapper pmProtocolItemViewMapper;

}
