package com.company.project.service.impl;

import com.company.project.dao.PaTaskItemPointItemMapMapper;
import com.company.project.model.PaTaskItemPointItemMap;
import com.company.project.service.PaTaskItemPointItemMapService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/12.
 */
@Service
@Transactional
public class PaTaskItemPointItemMapServiceImpl extends AbstractService<PaTaskItemPointItemMap> implements PaTaskItemPointItemMapService {
    @Resource
    private PaTaskItemPointItemMapMapper paTaskItemPointItemMapMapper;

}
