package org.niit.domain;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private String departmentName;
    private String departmentID;
    private String departmentHOD;

    public Department() {
        this.departmentName="IT Dept";
        this.departmentID="#dep16";
        this.departmentHOD="Musk Tesla";
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentHOD() {
        return departmentHOD;
    }

    public void setDepartmentHOD(String departmentHOD) {
        this.departmentHOD = departmentHOD;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentID='" + departmentID + '\'' +
                ", departmentHOD='" + departmentHOD + '\'' +
                '}';
    }
}
