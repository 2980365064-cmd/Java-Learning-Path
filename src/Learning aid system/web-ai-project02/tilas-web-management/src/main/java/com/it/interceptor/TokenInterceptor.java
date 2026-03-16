package com.it.interceptor;

import com.it.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
@Component
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

       String token = request.getHeader("token");

        try {
            JwtUtils.parseToken(token);
        } catch (Exception e) {
            log.info("令牌非法");
            response.setStatus(401);
            return false;
        }
        log.info("令牌合法");
        return true;
    }
}
