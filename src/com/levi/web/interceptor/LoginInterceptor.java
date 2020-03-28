package com.levi.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 拦截
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        //拦截
        //1.排除不需要拦截路径
        System.out.println("客户端访问资源的路径:" + request.getRequestURI());
        if(request.getRequestURI().endsWith("login.do")){
            return true;//放行
        }

        //2.如果已经登录，也要放行
        if(request.getSession().getAttribute("user") != null){
            return true;
        }

        //3.进入到login页面
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        return false;
    }

    /**
     * 未返回视图前 后处理
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("未返回视图前 后处理....");
    }

    /**
     * 返回视图前  后处理
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("返回视图前  后处理");
    }
}
