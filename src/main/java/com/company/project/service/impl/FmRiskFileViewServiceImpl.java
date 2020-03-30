package com.company.project.service.impl;

import com.company.project.dao.FmRiskFileViewMapper;
import com.company.project.model.FmRiskFileView;
import com.company.project.service.FmRiskFileViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/19.
 */
@Service
@Transactional
public class FmRiskFileViewServiceImpl extends AbstractService<FmRiskFileView> implements FmRiskFileViewService {
    @Resource
    private FmRiskFileViewMapper fmRiskFileViewMapper;

}
