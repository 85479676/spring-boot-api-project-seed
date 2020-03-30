package com.company.project.service.impl;

import com.company.project.dao.PaPatrolPointItemMapper;
import com.company.project.model.PaPatrolPointItem;
import com.company.project.service.PaPatrolPointItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
@Service
@Transactional
public class PaPatrolPointItemServiceImpl extends AbstractService<PaPatrolPointItem> implements PaPatrolPointItemService {
    @Resource
    private PaPatrolPointItemMapper paPatrolPointItemMapper;

    @Override
    public int updatePoint(List<PaPatrolPointItem> list) {
        return paPatrolPointItemMapper.updatePoint(list);
    }
}
