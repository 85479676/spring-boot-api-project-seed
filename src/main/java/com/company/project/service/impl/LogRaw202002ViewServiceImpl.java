package com.company.project.service.impl;

import com.company.project.dao.LogRaw202002ViewMapper;
import com.company.project.model.LogRaw202002View;
import com.company.project.service.LogRaw202002ViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/10.
 */
@Service
@Transactional
public class LogRaw202002ViewServiceImpl extends AbstractService<LogRaw202002View> implements LogRaw202002ViewService {
    @Resource
    private LogRaw202002ViewMapper logRaw202002ViewMapper;

}
