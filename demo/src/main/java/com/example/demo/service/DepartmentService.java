package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public  Department saveDepartment(Department dept);

   public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long DepartmentId);

   public void deleteDeptById(Long departmentId);

    public Department UpdateDepartment(Long departmentId, Department dept);

    public Department FetchByName(String name);
}
