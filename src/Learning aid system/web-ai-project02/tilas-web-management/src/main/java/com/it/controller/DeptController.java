package com.it.controller;

import com.it.pojo.Dept;
import com.it.pojo.Result;
import com.it.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptlist=deptService.findAll();
        return Result.success(deptlist);
    }
    @DeleteMapping
    public Result delete(Integer id){
        System.out.println("删除部门数据");
        deptService.delete(id);
        return Result.success();
    }
    @PostMapping
    public Result add(@RequestBody Dept dept){
        System.out.println("添加部门数据");
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable Integer id){
        System.out.println("通过ID查询部门数据");
       Dept dept= deptService.getById(id);
       return Result.success(dept);
    }
    @PutMapping
    public Result update(@RequestBody Dept dept){
        System.out.println("更新部门数据");
        deptService.update(dept);
        return Result.success();
    }
}
