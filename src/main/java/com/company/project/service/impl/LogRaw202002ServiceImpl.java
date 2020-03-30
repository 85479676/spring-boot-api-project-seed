package com.company.project.service.impl;

import com.company.project.dao.LogRaw202002Mapper;
import com.company.project.model.LogRaw202002;
import com.company.project.service.LogRaw202002Service;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/23.
 */
@Service
@Transactional
public class LogRaw202002ServiceImpl extends AbstractService<LogRaw202002> implements LogRaw202002Service {
    @Resource
    private LogRaw202002Mapper logRaw202002Mapper;

}
