package com.company.project.service.impl;

import com.company.project.dao.PmProtocolItemMapper;
import com.company.project.model.PmProtocolItem;
import com.company.project.service.PmProtocolItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class PmProtocolItemServiceImpl extends AbstractService<PmProtocolItem> implements PmProtocolItemService {
    @Resource
    private PmProtocolItemMapper pmProtocolItemMapper;

}
