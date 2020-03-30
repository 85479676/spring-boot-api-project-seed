package com.company.project.service.impl;

import com.company.project.dao.LogDispositionUserMapper;
import com.company.project.model.LogDispositionUser;
import com.company.project.service.LogDispositionUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/17.
 */
@Service
@Transactional
public class LogDispositionUserServiceImpl extends AbstractService<LogDispositionUser> implements LogDispositionUserService {
    @Resource
    private LogDispositionUserMapper logDispositionUserMapper;

}
