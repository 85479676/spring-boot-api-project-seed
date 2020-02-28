package com.company.project.service;

import com.company.project.model.OauOpenId;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2020/02/26.
 */
public interface OauOpenIdService extends Service<OauOpenId> {
    OauOpenId selectByName(String name);

}
