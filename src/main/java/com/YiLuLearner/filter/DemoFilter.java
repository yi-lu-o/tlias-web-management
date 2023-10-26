package com.YiLuLearner.filter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;


//@WebFilter(urlPatterns = "/*") //配置过滤器要拦截的请求路径（ /* 表示拦截浏览器的所有请求 ）
//public class DemoFilter implements Filter {
//    @Override //初始化方法, 只调用一次
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("init 初始化方法执行了");
//    }
//
//    @Override //拦截到请求之后调用, 调用多次
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("Demo 拦截到了请求...放行前逻辑");
//        //放行
//        //chain.doFilter(request,response);
//    }
//
//    @Override //销毁方法, 只调用一次
//    public void destroy() {
//        System.out.println("destroy 销毁方法执行了");
//    }
//
//}
