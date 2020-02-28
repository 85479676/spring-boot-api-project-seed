package com.company.project.configurer;

import com.company.project.util.JwtHelper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamInterceptor implements HandlerInterceptor {
    @Resource
    private JwtHelper jwtHelper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        boolean status = false;
        response.setCharacterEncoding("utf-8");
        String token = response.getHeader("accessToken");
        if (null != token) {
            boolean result = jwtHelper.verify(token);//验证token有效
            if (result) {
                status = true;
            }
            String url = request.getRequestURI();
            if (url.equals("/getlogin")) {//如果token无效就直接跳转到登陆页或主页
                response.sendRedirect(request.getContextPath() + "/getindex");
            }

        }
        return status;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
