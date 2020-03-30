package com.company.project.service;
import com.company.project.core.Service;
import com.company.project.model.MaDeductionItem;
import com.company.project.model.MaDeductionItems;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/17.
 */
public interface MaDeductionItemService extends Service<MaDeductionItem> {
    public List<MaDeductionItems> getMark(String domainUnid);
}
