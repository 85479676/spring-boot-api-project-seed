package com.company.project.service;
import com.company.project.model.MdGrid;
import com.company.project.core.Service;
import org.springframework.data.repository.query.Param;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
public interface MdGridService extends Service<MdGrid> {
    public MdGrid selectGridKey(@Param("unid") String unid);

}
