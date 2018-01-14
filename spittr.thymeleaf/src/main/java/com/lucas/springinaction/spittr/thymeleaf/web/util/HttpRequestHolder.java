package com.lucas.springinaction.spittr.thymeleaf.web.util;

import com.google.common.base.Charsets;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

/**
 * @author: liucaisi
 * @date: 2018/1/6
 */
public class HttpRequestHolder {
    private static final Logger LOGGER = LogManager.getLogger(HttpRequestHolder.class);

    /**
     * 获取 httpServletRequest
     *
     * @return
     */
    public static HttpServletRequest getHttpRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes != null && requestAttributes instanceof ServletRequestAttributes) {
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
            return servletRequestAttributes.getRequest();
        } else {
            return null;
        }
    }

    /**
     * 从 httpRequest的Header中获取属性
     *
     * @return
     */
    public static String getRequestHeader(String header) {
        HttpServletRequest request = getHttpRequest();
        if (request != null) {
            String headerValue = request.getHeader(header);
            return headerValue != null ? headerValue : StringUtils.EMPTY;
        }
        return StringUtils.EMPTY;
    }

    /**
     * 从 httpRequest的Header中获取cookie
     *
     * @return
     */
    public static String getRequestCookie(String cookieKey) {
        HttpServletRequest request = getHttpRequest();
        if (request != null) {
            Cookie[] cookies = request.getCookies();
            String cookieUUid = null;
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals(cookieKey)) {
                        cookieUUid = cookie.getValue();
                        break;
                    }
                }
            }
            return urlDecode(cookieUUid);
        }
        return StringUtils.EMPTY;
    }


    public static String urlDecode(String cookie) {
        if (Strings.isBlank(cookie)) {
            return Strings.EMPTY;
        }
        try {
            return URLDecoder.decode(cookie, Charsets.UTF_8.name());
        } catch (Exception e) {
            LOGGER.warn("url decode exception", e);
            return Strings.EMPTY;
        }
    }


    /**
     * 从 httpRequest的Header中获取请求参数
     *
     * @return
     */
    public static String getRequestParam(HttpServletRequest request, String paramName) {
        if (request == null) {
            request = getHttpRequest();
        }
        if (request != null) {
            String value = request.getParameter(paramName);
            return value != null ? value : StringUtils.EMPTY;
        }
        return StringUtils.EMPTY;
    }

}
