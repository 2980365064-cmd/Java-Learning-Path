package com.it.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.it.mapper.EmpExprMapper;
import com.it.mapper.EmpMapper;
import com.it.pojo.Emp;
import com.it.pojo.EmpExpr;
import com.it.pojo.LoginInfo;
import com.it.pojo.PageResult;
import com.it.service.EmpService;
import com.it.utils.JwtUtils;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    
    @Autowired
    private EmpExprMapper empExprMapper;

    @Override
    public PageResult<Emp> page(Integer page, Integer pageSize, String name,
                                Integer gender,
                               LocalDate begin,
                                 LocalDate end) {
        PageHelper.startPage(page,pageSize);
        List<Emp> rows = empMapper.list(name,gender,begin,end);
        Page<Emp> p = (Page<Emp>) rows;
        return new PageResult<Emp>(p.getResult(),p.getTotal());
    }
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void save(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
       empMapper.insert(emp);
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)){
            exprList.forEach(expr -> {
                expr.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        }
    }
    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void delete(Integer[] ids) {
        empMapper.delete1(ids);
        empExprMapper.delete2(ids);
    }

    @Override
    public Emp findById(Integer id) {
        return empMapper.findById(id);
    }
@Transactional(rollbackFor = {Exception.class})
    @Override
    public void update(Emp emp) {
         emp.setUpdateTime(LocalDateTime.now());
         empMapper.updateById(emp);
         empExprMapper.delete2(new Integer[]{emp.getId()});
        List<EmpExpr> exprList = emp.getExprList();
        if (!CollectionUtils.isEmpty(exprList)){
            exprList.forEach(expr -> {
                expr.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        }
    }

    @Override
    public LoginInfo login(Emp emp) {
       Emp e = empExprMapper.selectByUserNameAndPassWord(emp);
       
       if (e == null) {
           return null;
       }
       
       // 构建 JWT claims
       Map<String, Object> claims = new HashMap<>();
       claims.put("id", e.getId());
       claims.put("username", e.getUsername());
       // 生成 JWT Token
       String token = JwtUtils.generateToken(claims);
       
       return new LoginInfo(e.getId(),e.getUsername() ,e.getName(), token);
    }
}
