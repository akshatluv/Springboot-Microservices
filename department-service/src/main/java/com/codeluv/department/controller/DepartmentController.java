package com.codeluv.department.controller;

import com.codeluv.department.entity.Department;
import com.codeluv.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDepartmentByID(@PathVariable("id")  Long departmentId){
        log.info("Inside getDepartment method of DepartmentController");
        return departmentService.getDepartmentByID(departmentId);
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside save department method of DepartmentController");
        return departmentService.saveDepartment(department);
    }
}
