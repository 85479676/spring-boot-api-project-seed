package com.company.project.service.impl;

import com.company.project.dao.PaTaskItemViewsMapper;
import com.company.project.model.PaTaskItemViews;
import com.company.project.service.PaTaskItemViewsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/10.
 */
@Service
@Transactional
public class PaTaskItemViewsServiceImpl extends AbstractService<PaTaskItemViews> implements PaTaskItemViewsService {
    @Resource
    private PaTaskItemViewsMapper paTaskItemViewsMapper;

}
