package com.company.project.service.impl;

import com.company.project.dao.LegButtonMapper;
import com.company.project.model.LegButton;
import com.company.project.service.LegButtonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class LegButtonServiceImpl extends AbstractService<LegButton> implements LegButtonService {
    @Resource
    private LegButtonMapper legButtonMapper;

}
