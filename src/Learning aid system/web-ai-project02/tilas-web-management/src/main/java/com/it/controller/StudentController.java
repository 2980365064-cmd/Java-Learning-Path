package com.it.controller;

import com.it.pojo.Page;
import com.it.pojo.PageResult;
import com.it.pojo.Result;
import com.it.pojo.Student;
import com.it.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/students")
@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public Result listStudents(Page  page){
        log.info("分页查询");
        PageResult<Student> pageResult= studentService.page(page);
        return Result.success(pageResult);
    }
    @PostMapping
    public Result addStudent(@RequestBody Student student){
        log.info("添加学生");
        studentService.add(student);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        log.info("查询id为{}的学生",id);
        Student student = studentService.findStudentById(id);
        return Result.success(student);
    }

    @PutMapping
    public Result updateStudent(@RequestBody Student student){
        log.info("修改学生数据 - 接收到的参数：{}", student);
        studentService.updateStudent(student);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除id为{}的学生",id);
        studentService.deleteStudent(id);
        return Result.success();
    }

    @PutMapping("/violation/{id}/{score}")
    public Result updateViolation(@PathVariable Integer id,@PathVariable Short score){
        log.info("修改学生id为{}的违规次数为{}",id,score);
        studentService.updateViolation(id,score);
        return Result.success();
    }
}
