package com.company.project.service.impl;

import com.company.project.dao.BsNotificationStrategyMapper;
import com.company.project.model.BsNotificationStrategy;
import com.company.project.service.BsNotificationStrategyService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class BsNotificationStrategyServiceImpl extends AbstractService<BsNotificationStrategy> implements BsNotificationStrategyService {
    @Resource
    private BsNotificationStrategyMapper bsNotificationStrategyMapper;

}
