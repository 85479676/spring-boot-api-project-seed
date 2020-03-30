package com.company.project.service;
import com.company.project.model.MaDeductionItemTypeView;
import com.company.project.core.Service;
import com.company.project.model.MaDeductionItemTypeViews;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/18.
 */
public interface MaDeductionItemTypeViewService extends Service<MaDeductionItemTypeView> {
    public List<MaDeductionItemTypeViews> getMark();
}
