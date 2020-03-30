package com.company.project.service.impl;

import com.company.project.dao.TokenMapper;
import com.company.project.model.Token;
import com.company.project.service.TokenService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/02.
 */
@Service
@Transactional
public class TokenServiceImpl extends AbstractService<Token> implements TokenService {
    @Resource
    private TokenMapper tokenMapper;

}
