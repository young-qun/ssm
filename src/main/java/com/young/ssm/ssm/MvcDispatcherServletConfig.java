package com.young.ssm.ssm;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @Auther:dep
 * @Date: 2019/7/8 20:17
 * @Description: spring MVC dispatcherServlet的配置类
 *AbstractAnnotationConfigDispatcherServletInitializer是实现 webapplicationInitializer的
 */
public class MvcDispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //spring的上下文
        return new Class[]{RootConfig.class};
    }

    @Override
    /**
     * 设置dispatcherServlet 的配置类
     */
    protected Class<?>[] getServletConfigClasses() {
        //spring MVC的上下文
        return new Class[]{webMvcConfiguration.class};
    }

    @Override
    /**
     * 设置隐射的路径
     */
    protected String[] getServletMappings() {
        return new String[]{"/app/*"};
    }


    /**
     * 设置过滤器,向过滤器链表中添加过滤器
     */
    @Override
    protected Filter[] getServletFilters() {
        //编码格式过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        Filter[] filters = new Filter[]{characterEncodingFilter};
        return filters;
    }

    /**
     * 用户自定义spring mvc的配置 会覆盖默认配置
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //文件上传的路径  文件最大大小 最多请求数量
        registration.setMultipartConfig(new MultipartConfigElement("/temp",102400,102400,0));
    }


}
