package com.YiLuLearner.mapper;
import com.YiLuLearner.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface EmpMapper {
    //获取总记录数
    @Select("select count(*) from practice.emp")
    public Long count();

    //获取当前页的结果列表
    @Select("select * from practice.emp limit #{start}, #{pageSize}")
    public List<Emp> list(Integer start, Integer pageSize);

    //批量删除
    void delete(List<Integer> ids);
    //新增员工
    @Insert("insert into practice.emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime});")
    void insert(Emp emp);
}
