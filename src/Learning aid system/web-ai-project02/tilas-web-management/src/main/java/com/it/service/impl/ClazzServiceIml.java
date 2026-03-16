package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.it.mapper.ClazzMapper;
import com.it.pojo.Clazz;
import com.it.pojo.Emp;
import com.it.pojo.Page;
import com.it.pojo.PageResult;
import com.it.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ClazzServiceIml implements ClazzService {
    @Autowired
    private ClazzMapper ClazzMapper;
    @Override
    public PageResult<Clazz> page(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize());
        List<Clazz> list= ClazzMapper.list(page);
        com.github.pagehelper.Page<Clazz> p = (com.github.pagehelper.Page<Clazz>) list;
        return new PageResult<Clazz>(p.getResult(),p.getTotal());
    }

    @Override
    public List<Emp> findAll() {
        return ClazzMapper.findAll();
    }

    @Override
    public void save(Clazz clazz) {
         clazz.setUpdateTime(LocalDateTime.now());
         Integer id =ClazzMapper.findIdByName(clazz.getMasterName());
         clazz.setMasterId(id);
        ClazzMapper.save(clazz);
    }

    @Override
    public Clazz findById(Integer id) {
        return ClazzMapper.findById(id);
    }

    @Override
    public void update(Clazz clazz) {
        clazz.setUpdateTime(LocalDateTime.now());
       ClazzMapper.update(clazz);
    }

    @Override
    public void delete(Integer id) {
        ClazzMapper.delete(id);
    }

    @Override
    public List<Clazz> findAllClazz() {
        return ClazzMapper.findAllClazz();
    }
}
