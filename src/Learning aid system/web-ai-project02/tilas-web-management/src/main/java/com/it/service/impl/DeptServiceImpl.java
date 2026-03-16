package com.it.service.impl;

import com.it.mapper.DeptMapper;
import com.it.pojo.Dept;
import com.it.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        deptMapper.delete(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);

    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}

 