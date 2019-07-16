package com.young.ssm.intercept;

import org.aopalliance.intercept.Interceptor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Auther:dep
 * @Date: 2019/7/4 15:39
 * @Description:新建一个拦截器用于将请求中的locale转换成页面选择的语种
 */
public class I18nLanguageIntercept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String language = request.getParameter("language");
        if(StringUtils.isEmpty(language)){
            request.setAttribute("locale", LocaleContextHolder.getLocale());
        }else{
            if("en".equals(language)){
                request.setAttribute("locale", Locale.US);
            }else if("zh".equals(language)){
                request.setAttribute("locale", Locale.SIMPLIFIED_CHINESE);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
