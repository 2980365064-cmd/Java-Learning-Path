package com.it.exception;

import com.it.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        log.error("服务器发生异常:{}",e.getMessage());
        return Result.error("服务器发生异常");
    }
}
