package com.company.project.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import java.util.ArrayList;
import java.util.List;

public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private ParamInterceptor paramInterceptor;

    @Autowired
    public void addInterceptors(InterceptorRegistry registry) {
        //此处配置拦截路径

//        List<String> exclude = new ArrayList<String>();
//        exclude.add("/getlogin");
//        exclude.add("/getregister");
//        exclude.add("/getindex");
//        exclude.add("/login");
//        exclude.add("/register");
//        exclude.add("/api/login");
//        exclude.add("/get/**");
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆token也可以访问这些接口，还有带有get的下级的接口都可以不经过登录就访问。

//        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(exclude);
        //super.addInterceptors(registry);
        registry.addInterceptor(paramInterceptor).addPathPatterns("/**").excludePathPatterns("/api/login");
    }



    //配置静态资源（不然页面报404,会被拦截过滤）
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static");
    }

//}


}
