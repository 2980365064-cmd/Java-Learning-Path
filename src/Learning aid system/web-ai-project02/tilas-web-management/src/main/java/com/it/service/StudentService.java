package com.it.service;

import com.it.pojo.Page;
import com.it.pojo.PageResult;
import com.it.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    PageResult<Student> page(Page page);

    void add(Student student);

    Student findStudentById(Integer id);

    void updateStudent(Student student);

    void deleteStudent(Integer id);

    void updateViolation(Integer id, Short score);
}
