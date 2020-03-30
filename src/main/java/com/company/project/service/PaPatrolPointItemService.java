package com.company.project.service;

import com.company.project.model.PaPatrolPointItem;
import com.company.project.core.Service;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/09.
 */
public interface PaPatrolPointItemService extends Service<PaPatrolPointItem> {
    int updatePoint(@Param("unid") List<PaPatrolPointItem> list);

}
