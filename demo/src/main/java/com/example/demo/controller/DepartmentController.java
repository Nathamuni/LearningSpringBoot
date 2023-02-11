package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired //👈 tells this is the DepartmentService i want from spring
    private DepartmentService departmentservice;


    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);//3:1:20


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department dept){
                                     //  👆 we here pass request body
        //  ,what ever json object coming we need to convert into department entity

        LOGGER.info("Inside save department method");
        return departmentservice.saveDepartment(dept);

    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartmentList method");
        return departmentservice.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    // find based on this id   👆 should be same over     👇
    public  Department fetchDepartmentById(@PathVariable("id") Long departmentId){
                                         //👆 find department based on this id
        return departmentservice.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepById(@PathVariable("id") Long departmentId){
        departmentservice.deleteDeptById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDept(@PathVariable("id") Long departmentId,
                                 @RequestBody Department dept)
    {
        return departmentservice.UpdateDepartment(departmentId,dept);
    }

    @GetMapping("/departments/name/{name}")
    public Department FetchByName(@PathVariable("name") String Name){
        return departmentservice.FetchByName(Name);
    }
}
