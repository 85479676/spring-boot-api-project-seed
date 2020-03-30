package com.company.project.service.impl;

import com.company.project.dao.PaTaskItemWxViewMapper;
import com.company.project.model.PaTaskItemWxView;
import com.company.project.service.PaTaskItemWxViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class PaTaskItemWxViewServiceImpl extends AbstractService<PaTaskItemWxView> implements PaTaskItemWxViewService {
    @Resource
    private PaTaskItemWxViewMapper paTaskItemWxViewMapper;

}
