package com.company.project.service.impl;

import com.company.project.dao.BsNotificationPersonMapper;
import com.company.project.model.BsNotificationPerson;
import com.company.project.service.BsNotificationPersonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class BsNotificationPersonServiceImpl extends AbstractService<BsNotificationPerson> implements BsNotificationPersonService {
    @Resource
    private BsNotificationPersonMapper bsNotificationPersonMapper;

}
