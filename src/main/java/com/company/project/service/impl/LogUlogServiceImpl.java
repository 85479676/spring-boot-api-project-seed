package com.company.project.service.impl;

import com.company.project.dao.LogUlogMapper;
import com.company.project.model.LogUlog;
import com.company.project.service.LogUlogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/25.
 */
@Service
@Transactional
public class LogUlogServiceImpl extends AbstractService<LogUlog> implements LogUlogService {
    @Resource
    private LogUlogMapper logUlogMapper;

}
