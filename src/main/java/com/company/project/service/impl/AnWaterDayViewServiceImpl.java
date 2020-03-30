package com.company.project.service.impl;

import com.company.project.dao.AnWaterDayViewMapper;
import com.company.project.model.AnWaterDayView;
import com.company.project.service.AnWaterDayViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/04.
 */
@Service
@Transactional
public class AnWaterDayViewServiceImpl extends AbstractService<AnWaterDayView> implements AnWaterDayViewService {
    @Resource
    private AnWaterDayViewMapper anWaterDayViewMapper;

}
