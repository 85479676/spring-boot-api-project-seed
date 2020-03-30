package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.MaDeductionItem;
import com.company.project.model.MaDeductionItems;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MaDeductionItemMapper extends Mapper<MaDeductionItem> {
    public List<MaDeductionItems> getMark(@Param("domainUnid") String domainUnid);
}