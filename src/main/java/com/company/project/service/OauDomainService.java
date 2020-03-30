package com.company.project.service;

import com.company.project.model.OauDomain;
import com.company.project.core.Service;
import org.springframework.data.repository.query.Param;


/**
 * Created by CodeGenerator on 2020/02/14.
 */
public interface OauDomainService extends Service<OauDomain> {

    OauDomain selectName(String domain_unid);

    int deleteDomain(@Param("UNID") String unid);

    void addDomain(OauDomain oauDomain);

    void updateDomain(OauDomain oauDomain);
}
