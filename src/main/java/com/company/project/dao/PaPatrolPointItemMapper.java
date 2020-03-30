package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.PaPatrolPointItem;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaPatrolPointItemMapper extends Mapper<PaPatrolPointItem> {
    int updatePoint(@Param(value = "list") List<PaPatrolPointItem> list);
}