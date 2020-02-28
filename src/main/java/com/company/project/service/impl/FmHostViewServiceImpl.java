package com.company.project.service.impl;

import com.company.project.dao.FmHostViewMapper;
import com.company.project.model.FmHostView;
import com.company.project.service.FmHostViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/26.
 */
@Service
@Transactional
public class FmHostViewServiceImpl extends AbstractService<FmHostView> implements FmHostViewService {
    @Resource
    private FmHostViewMapper fmHostViewMapper;

}
