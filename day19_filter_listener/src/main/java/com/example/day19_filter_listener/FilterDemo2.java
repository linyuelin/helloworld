package com.example.day19_filter_listener;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("filterDemo2やって来た");
        chain.doFilter(req, resp);
        System.out.println("filterDemo2カンムバック");

    }

    @Override
    public void destroy() {

    }
}
