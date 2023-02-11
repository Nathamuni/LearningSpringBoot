package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class departmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department dept) {
        return departmentRepository.save(dept);
//    One of the methodfrom JpaRepository👆 that we extended
    }


    // retrive all departments from DB
    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    // retrive department by id given from DB
    public Department fetchDepartmentById(Long departmentId){
        return departmentRepository.findById(departmentId).get();
        //    Since it returns optional we use       👆
    }


    // delete dept by id
    @Override
    public void deleteDeptById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department UpdateDepartment(Long departmentId, Department dept){
        Department dp = departmentRepository.findById(departmentId).get();

        //check anything is notNull👇
        if(Objects.nonNull(dept.getDepartmentname()) &&
        !"".equalsIgnoreCase(dept.getDepartmentname())){//👈 anything blank
            dp.setDepartmentname(dept.getDepartmentname());
        }

        if(Objects.nonNull(dept.getDepartmentCode()) &&
                !"".equalsIgnoreCase(dept.getDepartmentCode())){//👈 anything blank
            dp.setDepartmentCode(dept.getDepartmentCode());
        }

        if(Objects.nonNull(dept.getDepartmentAdds()) &&
                !"".equalsIgnoreCase(dept.getDepartmentAdds())){//👈 anything blank
            dp.setDepartmentAdds(dept.getDepartmentAdds());
        }
        return departmentRepository.save(dp);
    }
//*********** it is importent to have the same name of the department parameter name
//   by findBy departmentname  IgnoreCase .... with proper notation
    @Override
    public Department FetchByName(String name) {
        return departmentRepository.findBydepartmentnameIgnoreCase(name);
    }
//    Since we dont have a default method in JpaRepo  -- create one
//    on DepartmentRepository create a method that takes respective parameters
//    and no need to for implementation

//    👆THESE ARE CALLED END POINTS..!
}
