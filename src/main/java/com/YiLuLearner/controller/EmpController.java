package com.YiLuLearner.controller;

import com.YiLuLearner.pojo.Emp;
import com.YiLuLearner.pojo.PageBean;
import com.YiLuLearner.pojo.Result;
import com.YiLuLearner.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    //条件分页查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize) {
        //调用业务层分页查询功能
        PageBean pageBean = empService.page(page, pageSize);
        //响应
        return Result.success(pageBean);
    }
    //批量删除
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        empService.delete(ids);
        return Result.success();
    }
    //新增
    @PostMapping
    public Result save(@RequestBody Emp emp){
        //调用业务层新增功能
        empService.save(emp);
        //响应
        return Result.success();
    }
}
