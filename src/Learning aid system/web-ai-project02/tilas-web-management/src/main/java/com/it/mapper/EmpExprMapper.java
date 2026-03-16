package com.it.mapper;

import com.it.pojo.Emp;
import com.it.pojo.EmpExpr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpExprMapper {

    void insertBatch(List<EmpExpr> exprList);


    void delete2(Integer[] ids);
   @Select("select  begin, end, company, job from emp_expr where emp_id=#{id}")
   Emp findById(Integer id);
@Select("SELECT id,username,name FROM tlias.emp WHERE username=#{username} and password = #{password}")
    Emp selectByUserNameAndPassWord(Emp emp);
}
