package com.company.project.service.impl;

import com.company.project.dao.MdGridMapper;
import com.company.project.model.MdGrid;
import com.company.project.service.MdGridService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
@Service
@Transactional
public class MdGridServiceImpl extends AbstractService<MdGrid> implements MdGridService {
    @Resource
    private MdGridMapper mdGridMapper;

    @Override
    public MdGrid selectGridKey(String unid) {
        return mdGridMapper.selectGridKey(unid);
    }
}
