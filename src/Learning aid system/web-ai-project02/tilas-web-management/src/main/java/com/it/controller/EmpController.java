package com.it.controller;

import com.it.pojo.Emp;
import com.it.pojo.PageResult;
import com.it.pojo.Result;
import com.it.service.ClazzService;
import com.it.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/emps")
@Slf4j
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    private ClazzService clazzService;
    @GetMapping
    public Result list(Integer page, Integer pageSize, String name,
                       Integer gender,
                       @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate end
  ){
        log.info("分页查询:{},{}",page,pageSize);
        PageResult<Emp> pageResult = empService.page(page, pageSize,name,gender,begin,end);
        return Result.success(pageResult);
    }
    @GetMapping("/list")
    public Result findAll(){
        log.info("查询所有班主任");
        List<Emp> clazzList= clazzService.findAll();
        return Result.success(clazzList);
    }
    //新增员工
    @PostMapping
    public Result save(@RequestBody Emp emp){
      empService.save(emp);
      return Result.success();
    }
    //删除员工
    @DeleteMapping
    public Result delete ( Integer[] ids){
        empService.delete(ids);
        return Result.success();
    }
    //增加员工
    @GetMapping("/{id}")
    public Result get(@PathVariable Integer id){
        Emp e = empService.findById(id);
        return Result.success(e);
    }
    //修改员工
    @PutMapping
    public Result update(@RequestBody Emp emp){
        empService.update(emp);
        return Result.success();
    }
}
