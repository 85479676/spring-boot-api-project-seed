package com.company.project.configurer;


import com.company.project.model.OauDomain;
import com.company.project.model.Token;
import com.company.project.service.OauDomainService;
import com.company.project.service.TokenService;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 通过TOKEN来验证权限和权限下面相关的用户组
 */
public abstract class DomainedResource {
    @Resource
    private TokenService tokenService;

    @Resource
    private OauDomainService domainService;

    public String tokenValue(HttpServletRequest request, String domainUnid) {
        List<Token> list = null;
        List<OauDomain> domains = null;
//        Token ken = new Token();
        String token = request.getHeader("Authorization");
        String[] tokenValue = token.split(" ");


        if (domainUnid == null) {
            Condition condition = new Condition(Token.class);
            condition.createCriteria().andCondition("TOKEN='" + tokenValue[1] + "'");
            list = tokenService.findByCondition(condition);
            StringBuilder builder = new StringBuilder();
            if (list.size() > 0) {
                for (Token token1 : list
                ) {
                    if (builder.length() > 0) {
                        builder.append(" or ");
                    }
                    builder.append("(");
                    //               if (prefix != null)
//                    builder.append(prefix).append(".");
                    builder.append("LEFT_INX>").append(token1.getLeftInx() - 1);
                    builder.append(" and ");
                    //              if (prefix != null)
//                    builder.append(prefix).append(".");
                    builder.append("RIGHT_INX<").append(token1.getRightInx() + 1);
                    builder.append(")");
                }
                return "(" + builder.toString() + ")";
            } else {
                return "1!=1";
            }

        } else {
            Condition condition = new Condition(OauDomain.class);
            condition.createCriteria().andCondition("UNID='" + domainUnid + "'");
            domains = domainService.findByCondition(condition);
            StringBuilder builder = new StringBuilder();
            if (domains.size() > 0) {
                for (OauDomain domain : domains
                ) {
                    if (builder.length() > 0) {
                        builder.append(" or ");
                    }
                    builder.append("(");
                    builder.append("LEFT_INX>").append(domain.getLeftInx() - 1);
                    builder.append(" and ");
                    builder.append("RIGHT_INX<").append(domain.getRightInx() + 1);
                    builder.append(")");
                }
                return "(" + builder.toString() + ")";
            } else {
                return "1!=1";
            }

        }


    }


}
