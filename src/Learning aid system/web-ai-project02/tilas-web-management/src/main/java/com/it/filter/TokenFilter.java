package com.it.filter;

import com.it.utils.JwtUtils;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
@Slf4j
//@WebFilter("/*")
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();
        if(requestURI.contains("/login")){
            log.info("登录请求");
            filterChain.doFilter(request,response);
            return;
        }
        String token = request.getHeader("token");
        if(token== null|| token.isEmpty()){
            log.info("未登录");
            response.setStatus(401);
            return;
        }
        try {
            JwtUtils.parseToken(token);
        } catch (Exception e) {
            log.info("令牌非法");
            response.setStatus(401);
            return;
        }


        log.info("令牌合法");
        filterChain.doFilter(request,response);
    }
}
