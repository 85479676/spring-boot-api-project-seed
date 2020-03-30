package com.company.project.service.impl;

import com.company.project.dao.BsNotificationLogViewMapper;
import com.company.project.model.BsNotificationLogView;
import com.company.project.service.BsNotificationLogViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class BsNotificationLogViewServiceImpl extends AbstractService<BsNotificationLogView> implements BsNotificationLogViewService {
    @Resource
    private BsNotificationLogViewMapper bsNotificationLogViewMapper;

}
