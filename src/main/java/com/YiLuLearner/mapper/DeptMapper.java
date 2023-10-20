package com.YiLuLearner.mapper;

import com.YiLuLearner.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from practice.dept")
    List<Dept> selectAll();
    @Delete("delete from practice.dept where id=#{id}")
    void deleteById(Integer id);
    @Insert("insert into practice.dept (name, create_time, update_time) " +
            "values(#{name},#{createTime},#{updateTime})")
    void addDept(Dept dept);
}
