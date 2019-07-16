package com.young.ssm.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther:dep
 * @Date: 2019/7/9 11:04
 * @Description:
 */
public class CharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("getmessage");
    }

    @Override
    public void destroy() {

    }
}
