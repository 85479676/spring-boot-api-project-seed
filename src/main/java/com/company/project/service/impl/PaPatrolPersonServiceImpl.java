package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPersonMapper;
import com.company.project.model.PaPatrolPerson;
import com.company.project.service.PaPatrolPersonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PaPatrolPersonServiceImpl extends AbstractService<PaPatrolPerson> implements PaPatrolPersonService {
    @Resource
    private PaPatrolPersonMapper paPatrolPersonMapper;

}
