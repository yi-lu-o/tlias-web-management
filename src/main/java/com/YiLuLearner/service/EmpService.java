package com.YiLuLearner.service;

import com.YiLuLearner.pojo.PageBean;

import java.util.List;

public interface EmpService {
    /**
     * 条件分页查询
     * @param page 页码
     * @param pageSize 每页展示记录数
     * @return
     */
    PageBean page(Integer page, Integer pageSize);
    /**
     * 批量删除操作
     * @param ids id集合
     */
    void delete(List<Integer> ids);
}
