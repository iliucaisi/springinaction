package com.lucas.springinaction.spittr.thymeleaf.web.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContext;

/**
 * @author: liucaisi
 * @date: 2018/1/6
 */
public class CurrentContext {
    private static final Logger logger = LogManager.getLogger(CurrentContext.class);
    private static ThreadLocal<String> phone = new ThreadLocal<>();
    private static ThreadLocal<String> url = new ThreadLocal<>();
    private static ThreadLocal<ServletContext> servletContext = new ThreadLocal<>();

    public static String getPhone() {
        return phone.get();
    }

    public static void setPhone(String phone) {
        CurrentContext.phone.set(phone);
    }

    public static String getUrl() {
        return url.get();
    }

    public static void setUrl(String url) {
        CurrentContext.url.set(url);
    }

    public static ServletContext getServletContext() {
        return CurrentContext.servletContext.get();
    }

    public static void setServletContext(ServletContext servletContext) {
        CurrentContext.servletContext.set(servletContext);
    }

    public static void clearAll() {
        logger.debug(">>>>>>>>>>>>>>>clean currentContext<<<<<<<<<<<<<<<<<<<<<<");
        phone.remove();
        url.remove();
    }
}
