package com.company.project.service.impl;

import com.company.project.dao.PmPaTaskItemViewMapper;
import com.company.project.model.PmPaTaskItemView;
import com.company.project.service.PmPaTaskItemViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PmPaTaskItemViewServiceImpl extends AbstractService<PmPaTaskItemView> implements PmPaTaskItemViewService {
    @Resource
    private PmPaTaskItemViewMapper pmPaTaskItemViewMapper;

}
