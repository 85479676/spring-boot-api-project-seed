package com.company.project.service.impl;

import com.company.project.dao.BsNotificationLogMapper;
import com.company.project.model.BsNotificationLog;
import com.company.project.service.BsNotificationLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/28.
 */
@Service
@Transactional
public class BsNotificationLogServiceImpl extends AbstractService<BsNotificationLog> implements BsNotificationLogService {
    @Resource
    private BsNotificationLogMapper bsNotificationLogMapper;

}
