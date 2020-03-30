package com.company.project.service.impl;

import com.company.project.dao.MaDeductionItemMapper;
import com.company.project.model.MaDeductionItem;
import com.company.project.model.MaDeductionItems;
import com.company.project.service.MaDeductionItemService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/17.
 */
@Service
@Transactional
public class MaDeductionItemServiceImpl extends AbstractService<MaDeductionItem> implements MaDeductionItemService {
    @Resource
    private MaDeductionItemMapper maDeductionItemMapper;


    @Override
    public List<MaDeductionItems> getMark(String domainUnid) {
        return maDeductionItemMapper.getMark(domainUnid);
    }
}
