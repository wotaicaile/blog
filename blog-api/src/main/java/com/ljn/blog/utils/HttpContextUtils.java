package com.ljn.blog.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpContextUtils {
  /**
   * 获取Request
   */
  public static HttpServletRequest getHttpServletRequest() {
    if(RequestContextHolder.getRequestAttributes()==null){
      return null;
    }
    return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
  }
  
  /**
   * 获取Response
   */
  public static HttpServletResponse getHttpServletResponse() {
    if(RequestContextHolder.getRequestAttributes()==null){
      return null;
    }
    return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
  }
}