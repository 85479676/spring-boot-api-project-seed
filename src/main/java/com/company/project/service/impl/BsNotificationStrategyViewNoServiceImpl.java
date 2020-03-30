package com.company.project.service.impl;

import com.company.project.dao.BsNotificationStrategyViewNoMapper;
import com.company.project.model.BsNotificationStrategyViewNo;
import com.company.project.service.BsNotificationStrategyViewNoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/15.
 */
@Service
@Transactional
public class BsNotificationStrategyViewNoServiceImpl extends AbstractService<BsNotificationStrategyViewNo> implements BsNotificationStrategyViewNoService {
    @Resource
    private BsNotificationStrategyViewNoMapper bsNotificationStrategyViewNoMapper;

}
