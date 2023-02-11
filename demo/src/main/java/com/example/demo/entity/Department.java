package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    private String departmentname;
    private String departmentAdds;
    private String departmentCode;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentAdds() {
        return departmentAdds;
    }

    public void setDepartmentAdds(String departmentAdds) {
        this.departmentAdds = departmentAdds;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }



    public Department(long departmentId, String departmentname, String departmentAdds, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentname = departmentname;
        this.departmentAdds = departmentAdds;
        this.departmentCode = departmentCode;
    }

    public Department(){

    }
    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentname='" + departmentname + '\'' +
                ", departmentAdds='" + departmentAdds + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }


}
