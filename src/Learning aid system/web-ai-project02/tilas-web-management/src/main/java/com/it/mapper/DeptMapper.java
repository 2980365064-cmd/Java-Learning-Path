package com.it.mapper;

import com.it.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select ID, NAME, CREATE_TIME, UPDATE_TIME FROM dept ORDER BY update_time DESC")
    List<Dept> findAll();

    @Delete("delete from dept where id=#{id}")
    void delete(int id);

    @Insert("insert into dept (name, create_time, update_time)values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("select id, name, create_time, update_time from dept where id=#{id}")
    Dept getById(Integer id);
    @Update("update dept set name=#{name}, update_time=#{updateTime} where id=#{id}")
    void update(Dept dept);
}
