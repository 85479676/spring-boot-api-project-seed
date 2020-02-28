package com.company.project.service.impl;

import com.company.project.dao.LegButtonViewMapper;
import com.company.project.model.LegButtonView;
import com.company.project.service.LegButtonViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/18.
 */
@Service
@Transactional
public class LegButtonViewServiceImpl extends AbstractService<LegButtonView> implements LegButtonViewService {
    @Resource
    private LegButtonViewMapper legButtonViewMapper;

}
