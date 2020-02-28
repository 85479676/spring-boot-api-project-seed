package com.company.project.service.impl;

import com.company.project.dao.OauAccessTokenMapper;
import com.company.project.model.OauAccessToken;
import com.company.project.service.OauAccessTokenService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/27.
 */
@Service
@Transactional
public class OauAccessTokenServiceImpl extends AbstractService<OauAccessToken> implements OauAccessTokenService {
    @Resource
    private OauAccessTokenMapper oauAccessTokenMapper;

}
