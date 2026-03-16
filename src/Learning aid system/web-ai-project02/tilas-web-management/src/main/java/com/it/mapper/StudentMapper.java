package com.it.mapper;

import com.it.pojo.Page;
import com.it.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> page(Page page);

    void add(Student student);

    Student findStudentById(Integer id);

    void update(Student student);

    void delete(Integer id);

    void updateViolation(Integer id, Short score);
}
