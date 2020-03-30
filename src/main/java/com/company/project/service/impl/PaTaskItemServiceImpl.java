package com.company.project.service.impl;

import com.company.project.dao.PaTaskItemMapper;
import com.company.project.model.PaTaskItem;
import com.company.project.service.PaTaskItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/10.
 */
@Service
@Transactional
public class PaTaskItemServiceImpl extends AbstractService<PaTaskItem> implements PaTaskItemService {
    @Resource
    private PaTaskItemMapper paTaskItemMapper;

}
