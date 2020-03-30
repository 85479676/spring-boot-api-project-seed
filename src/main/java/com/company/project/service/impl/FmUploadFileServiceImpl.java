package com.company.project.service.impl;

import com.company.project.dao.FmUploadFileMapper;
import com.company.project.model.FmUploadFile;
import com.company.project.service.FmUploadFileService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/27.
 */
@Service
@Transactional
public class FmUploadFileServiceImpl extends AbstractService<FmUploadFile> implements FmUploadFileService {
    @Resource
    private FmUploadFileMapper fmUploadFileMapper;

}
