package com.it.service;

import com.it.pojo.Emp;
import com.it.pojo.LoginInfo;
import com.it.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface EmpService {
    PageResult<Emp> page(Integer page, Integer pageSize, String name,
                         Integer gender,
                         @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                         @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate end);

    void save(Emp emp);

    void delete(Integer[] ids);

    Emp findById  (Integer id);

    void update(Emp emp);

    LoginInfo login(Emp emp);
}
