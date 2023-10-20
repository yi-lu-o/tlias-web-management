package com.YiLuLearner.service;

import com.YiLuLearner.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> selectAll();
    void deleteById(Integer id);
    void addDept(Dept dept);
}
