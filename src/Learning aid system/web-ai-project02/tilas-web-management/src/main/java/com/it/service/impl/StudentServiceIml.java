package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.it.mapper.StudentMapper;
import com.it.pojo.Page;
import com.it.pojo.PageResult;
import com.it.pojo.Student;
import com.it.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceIml implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public PageResult<Student> page(Page page) {
        PageHelper.startPage(page.getPage(),page.getPageSize());
        List<Student> list= studentMapper.page(page);
        com.github.pagehelper.Page<Student> p = (com.github.pagehelper.Page<Student>) list;
        return new PageResult<Student>(p.getResult(),p.getTotal());
    }

    @Override
    public void add(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());
        if (student.getViolationCount() == null) {
            student.setViolationCount((short)0);
        }
        if (student.getViolationScore() == null) {
            student.setViolationScore((short)0);
        }
        studentMapper.add(student);

    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        student.setUpdateTime(LocalDateTime.now());
        studentMapper.update(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.delete(id);
    }

    @Override
    public void updateViolation(Integer id, Short score) {
        Student s = studentMapper.findStudentById(id);
        short count= (short) (s.getViolationCount()+1);
        s.setViolationCount(count);
        score= (short) (s.getViolationScore()+score);
        s.setViolationScore(score);
        studentMapper.updateViolation(id,score);
    }
}
