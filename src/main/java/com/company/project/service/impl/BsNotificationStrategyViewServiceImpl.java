package com.company.project.service.impl;

import com.company.project.dao.BsNotificationStrategyViewMapper;
import com.company.project.model.BsNotificationStrategyView;
import com.company.project.service.BsNotificationStrategyViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class BsNotificationStrategyViewServiceImpl extends AbstractService<BsNotificationStrategyView> implements BsNotificationStrategyViewService {
    @Resource
    private BsNotificationStrategyViewMapper bsNotificationStrategyViewMapper;

}
