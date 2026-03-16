package com.it.controller;

import com.it.pojo.*;
import com.it.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {
    @Autowired
    private ClazzService clazzService;
    
    @GetMapping
    public Result list(Page page){
        log.info("分页查询");
        PageResult<Clazz> pageResult= clazzService.page(page);
        return Result.success(pageResult);
    }
    
    @PostMapping
    public Result add(@RequestBody Clazz clazz){
        log.info("添加班级数据 - 接收到的参数：name={}, room={}, masterId={}, subject={}", 
                 clazz.getName(), clazz.getRoom(), clazz.getMasterId(), clazz.getSubject());
        clazzService.save(clazz);
        return Result.success();
    }
    @GetMapping("{id}")
    public  Result findById(@PathVariable Integer id){
        log.info("查询id为{}的班级", id);
        Clazz clazz = clazzService.findById(id);
        return Result.success(clazz);
    }

    @GetMapping("/list")
    public Result list(){
        log.info("查询全部班级数据");
        List<Clazz> list = clazzService.findAllClazz();
        return Result.success(list);
    }
    @PutMapping
    public  Result update(@RequestBody Clazz clazz){
        log.info("修改班级数据 - 接收到的参数：id={}, name={}, room={}, masterId={}, subject={},beginDate={},endDate={}",
                clazz.getId(), clazz.getName(), clazz.getRoom(), clazz.getMasterId(),
                clazz.getSubject(), clazz.getBeginDate(), clazz.getEndDate());
        clazzService.update(clazz);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete( @PathVariable Integer id){
        log.info("删除班级数据 - 接收到的参数：{}", id);
        clazzService.delete(id);
        return Result.success();
    }


}
