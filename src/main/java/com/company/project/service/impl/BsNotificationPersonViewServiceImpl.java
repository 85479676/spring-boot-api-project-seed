package com.company.project.service.impl;

import com.company.project.dao.BsNotificationPersonViewMapper;
import com.company.project.model.BsNotificationPersonView;
import com.company.project.service.BsNotificationPersonViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class BsNotificationPersonViewServiceImpl extends AbstractService<BsNotificationPersonView> implements BsNotificationPersonViewService {
    @Resource
    private BsNotificationPersonViewMapper bsNotificationPersonViewMapper;

}
