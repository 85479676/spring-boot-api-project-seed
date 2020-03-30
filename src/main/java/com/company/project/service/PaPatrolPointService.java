package com.company.project.service;
import com.company.project.core.Service;
import com.company.project.model.PaPatrolPoint;


/**
 * Created by CodeGenerator on 2020/03/05.
 */
public interface PaPatrolPointService extends Service<PaPatrolPoint> {

    PaPatrolPoint selectGetName( String name);

}
