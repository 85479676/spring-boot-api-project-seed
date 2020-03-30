package com.company.project.service.impl;

import com.company.project.dao.FmUploadFileViewMapper;
import com.company.project.model.FmUploadFileView;
import com.company.project.service.FmUploadFileViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/27.
 */
@Service
@Transactional
public class FmUploadFileViewServiceImpl extends AbstractService<FmUploadFileView> implements FmUploadFileViewService {
    @Resource
    private FmUploadFileViewMapper fmUploadFileViewMapper;

}
