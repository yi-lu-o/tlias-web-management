package com.YiLuLearner.controller;

import com.YiLuLearner.pojo.Dept;
import com.YiLuLearner.pojo.Result;
import com.YiLuLearner.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    DeptService deptService;
    @GetMapping
    public Result list(){
        List<Dept> depts=deptService.selectAll();
        //List<Dept> depts=new ArrayList<>();
        return Result.success(depts);
    }
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        deptService.deleteById(id);
        return Result.success();
    }
    @PostMapping
    public Result addDept(@RequestBody Dept dept){
        deptService.addDept(dept);
        return Result.success();
    }
}
