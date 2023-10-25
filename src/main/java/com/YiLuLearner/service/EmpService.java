package com.YiLuLearner.service;

import com.YiLuLearner.pojo.Emp;
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
    void save(Emp emp);
    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    public Emp getById(Integer id);

    /**
     * 更新员工
     * @param emp
     */
    public void update(Emp emp);
    /**
     * 用户登录
     * @param emp
     * @return
     */
    public Emp login(Emp emp);
}
