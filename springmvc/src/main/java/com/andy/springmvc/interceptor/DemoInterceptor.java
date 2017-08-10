package com.andy.springmvc.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 继承HandlerInterceptorAdapter的拦截器
 * Created by dell on 2017/8/7.
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

    //请求发生之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    //请求发生之后执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView view) {

        long startTime = (long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理的时间为：" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handling time", endTime - startTime);
    }
}
