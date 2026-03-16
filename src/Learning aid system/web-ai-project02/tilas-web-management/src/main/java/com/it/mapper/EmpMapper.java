package com.it.mapper;

import com.it.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    public List<Emp> list( String name,
                           Integer gender, LocalDate begin, LocalDate end);
   @Options(useGeneratedKeys = true,keyProperty = "id")
   @Insert("insert into  emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)" +
           "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate} ,#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    void delete1(Integer[] ids);


    Emp findById(Integer id);

    void updateById(Emp emp);
}
