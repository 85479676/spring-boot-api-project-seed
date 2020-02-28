package com.company.project.service.impl;

import com.company.project.dao.LogUlogViewMapper;
import com.company.project.model.LogUlogView;
import com.company.project.service.LogUlogViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/28.
 */
@Service
@Transactional
public class LogUlogViewServiceImpl extends AbstractService<LogUlogView> implements LogUlogViewService {
    @Resource
    private LogUlogViewMapper logUlogViewMapper;

}
