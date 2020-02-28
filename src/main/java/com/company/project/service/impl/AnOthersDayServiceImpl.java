package com.company.project.service.impl;

import com.company.project.dao.AnOthersDayMapper;
import com.company.project.model.AnOthersDay;
import com.company.project.service.AnOthersDayService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/22.
 */
@Service
@Transactional
public class AnOthersDayServiceImpl extends AbstractService<AnOthersDay> implements AnOthersDayService {
    @Resource
    private AnOthersDayMapper anOthersDayMapper;

}
