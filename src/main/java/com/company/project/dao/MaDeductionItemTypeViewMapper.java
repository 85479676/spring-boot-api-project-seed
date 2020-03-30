package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.MaDeductionItemTypeView;
import com.company.project.model.MaDeductionItemTypeViews;

import java.util.List;

public interface MaDeductionItemTypeViewMapper extends Mapper<MaDeductionItemTypeView> {
    public List<MaDeductionItemTypeViews> getMark();

}