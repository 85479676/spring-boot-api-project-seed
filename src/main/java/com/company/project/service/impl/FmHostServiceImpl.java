package com.company.project.service.impl;

import com.company.project.dao.FmHostMapper;
import com.company.project.model.FmHost;
import com.company.project.service.FmHostService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/26.
 */
@Service
@Transactional
public class FmHostServiceImpl extends AbstractService<FmHost> implements FmHostService {
    @Resource
    private FmHostMapper fmHostMapper;

}
