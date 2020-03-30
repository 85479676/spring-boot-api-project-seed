package com.company.project.service.impl;

import com.company.project.dao.PaTaskItemPointViewMapper;
import com.company.project.model.PaTaskItemPointView;
import com.company.project.service.PaTaskItemPointViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class PaTaskItemPointViewServiceImpl extends AbstractService<PaTaskItemPointView> implements PaTaskItemPointViewService {
    @Resource
    private PaTaskItemPointViewMapper paTaskItemPointViewMapper;

}
