package com.it.service;

import com.it.pojo.Clazz;
import com.it.pojo.Emp;
import com.it.pojo.Page;
import com.it.pojo.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClazzService {
    PageResult<Clazz> page(Page page);

    List<Emp> findAll();

    void save(Clazz clazz);

    Clazz findById(Integer id);

    void update(Clazz clazz);

    void delete(Integer id);

    List<Clazz> findAllClazz();
}
