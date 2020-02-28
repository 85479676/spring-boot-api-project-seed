package com.company.project.service.impl;

import com.company.project.dao.AnElectricDayViewMapper;
import com.company.project.model.AnElectricDayView;
import com.company.project.service.AnElectricDayViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/02/22.
 */
@Service
@Transactional
public class AnElectricDayViewServiceImpl extends AbstractService<AnElectricDayView> implements AnElectricDayViewService {
    @Resource
    private AnElectricDayViewMapper anElectricDayViewMapper;

}
