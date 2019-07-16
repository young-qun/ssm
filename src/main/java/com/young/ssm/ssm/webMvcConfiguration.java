package com.young.ssm.ssm;

import com.young.ssm.intercept.I18nLanguageIntercept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresolver.DefaultTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * @Auther:dep
 * @Date: 2019/7/4 15:53
 * @Description: Spring MVC的配置类
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.young.ssm.entity")
public class webMvcConfiguration implements WebMvcConfigurer {
    /**设置视图解析器-内部资源处理
     *
     * @return
     */
    @Bean(name = "internalResourceViewResolver")
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    /**设置文件上传的解析器
     *
     * @return
     */
    @Bean(name = "multipartResolver")
    public MultipartResolver getMultipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxInMemorySize(4069);
        multipartResolver.setMaxUploadSizePerFile(10240000);
        return  multipartResolver;
    }


    /**
     * 定义Thymeleaf 的视图解析器
     */
    @Bean
    public ThymeleafViewResolver getThymeleafViewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(templateEngine);
        return  thymeleafViewResolver;
    }

    /**
     * 模板引擎 处理模板并渲染结果
     * @return
     */
    @Bean
    public TemplateEngine getTemplateEngine(ITemplateResolver iTemplateResolver){
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setEnableSpringELCompiler(true);
        templateEngine.setTemplateResolver(iTemplateResolver);
        return  templateEngine;
    }

    /**
     * 模板解析 加载模板
     */
    @Bean
    public ITemplateResolver getITemplateResolver(){
        SpringResourceTemplateResolver springResourceTemplateResolver = new SpringResourceTemplateResolver();
        springResourceTemplateResolver.setTemplateMode(TemplateMode.HTML);
        springResourceTemplateResolver.setSuffix(".html");
        springResourceTemplateResolver.setPrefix("/templates/");
        springResourceTemplateResolver.setCacheable(false);
        springResourceTemplateResolver.setCharacterEncoding("UTF-8");
        return  springResourceTemplateResolver;
    }

    /**
     * 设置静态资源默认处理
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * 新增拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //国际化的locale处理
        I18nLanguageIntercept i18nLanguageIntercept = new I18nLanguageIntercept();
        registry.addInterceptor(i18nLanguageIntercept);
    }

    /**
     * 异常处理
     * @param resolvers
     */
    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

    }

    /**
     * 消息转换器
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

}
