package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.MdGrid;
import org.springframework.data.repository.query.Param;

public interface MdGridMapper extends Mapper<MdGrid> {
    public MdGrid selectGridKey(@Param("unid") String unid);
}