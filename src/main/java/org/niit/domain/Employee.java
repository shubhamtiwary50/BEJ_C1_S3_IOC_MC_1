package org.niit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private  String empName;
    private String empID;
    private Department empDept;


    @Autowired
    public Employee(Department empDept) {
        this.empName="Elon";
        this.empID="#emp1246";
        this.empDept=empDept;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public Department getEmpDept() {
        return empDept;
    }

    public void setEmpDept(Department empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empID='" + empID + '\'' +
                ", empDept=" + empDept +
                '}';
    }
}
