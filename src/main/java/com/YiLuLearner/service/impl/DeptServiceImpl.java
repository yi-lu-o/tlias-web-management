package com.YiLuLearner.service.impl;

import com.YiLuLearner.mapper.DeptMapper;
import com.YiLuLearner.pojo.Dept;
import com.YiLuLearner.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;
    public List<Dept> selectAll(){
        List<Dept> depts=deptMapper.selectAll();
        return depts;
    }
    public void deleteById(Integer id){
        deptMapper.deleteById(id);
    }
    public void addDept(Dept dept){
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.addDept(dept);
    }
}
