package com.young.ssm.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Auther:dep
 * @Date: 2019/7/24 14:11
 * @Description: 配置druid的stat filter
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*", initParams = {
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
})
public class DruidStatWebFilter extends WebStatFilter {
}
