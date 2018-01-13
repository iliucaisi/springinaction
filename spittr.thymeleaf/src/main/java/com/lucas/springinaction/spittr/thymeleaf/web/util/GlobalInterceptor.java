package com.lucas.springinaction.spittr.thymeleaf.web.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: liucaisi
 * @date: 2018/1/6
 */
public class GlobalInterceptor implements HandlerInterceptor{
    private static final Logger LOGGER = LogManager.getLogger(GlobalInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        CurrentContext.clearAll();
        CurrentContext.setUrl(request.getRequestURI());
        handelPhone(request);
        CurrentContext.setServletContext(request.getServletContext());

        return true;
    }

    private void handelPhone(HttpServletRequest request) {
        String phone = HttpRequestHolder.getRequestParam(request, "phone");
        if (Strings.isBlank(phone)) {
            phone = HttpRequestHolder.getRequestParam(request, "mobile");
        }
        CurrentContext.setPhone(phone);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView
            modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception
            ex) throws Exception {
        CurrentContext.clearAll();
    }
}
