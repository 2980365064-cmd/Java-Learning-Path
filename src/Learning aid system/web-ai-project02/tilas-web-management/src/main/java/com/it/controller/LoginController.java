package com.it.controller;

import com.it.pojo.Emp;
import com.it.pojo.LoginInfo;
import com.it.pojo.Result;
import com.it.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
public class LoginController {
    @Autowired

    private EmpService empService;
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
      log.info("登录: {}", emp);
      LoginInfo login = empService.login(emp);
       return login == null ? Result.error("用户名或密码错误") : Result.success(login);
    }
}
