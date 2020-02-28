package com.company.project.service;
import com.company.project.model.OauDomain;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2020/02/14.
 */
public interface OauDomainService extends Service<OauDomain> {

    OauDomain selectName(String domain_unid);
}
