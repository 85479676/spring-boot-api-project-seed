package com.company.project.service.impl;

import com.company.project.dao.MaDeductionItemTypeViewMapper;
import com.company.project.model.MaDeductionItemTypeView;
import com.company.project.model.MaDeductionItemTypeViews;
import com.company.project.service.MaDeductionItemTypeViewService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/18.
 */
@Service
@Transactional
public class MaDeductionItemTypeViewServiceImpl extends AbstractService<MaDeductionItemTypeView> implements MaDeductionItemTypeViewService {
    @Resource
    private MaDeductionItemTypeViewMapper maDeductionItemTypeViewMapper;

    @Override
    public List<MaDeductionItemTypeViews> getMark() {
        return maDeductionItemTypeViewMapper.getMark();
    }
}
