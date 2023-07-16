package com.tekup.project;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployeeDetailsResponse", namespace = "http://www.tekup.com/xml/company")
public class EmployeeDetailsResponse {
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @XmlElement(name = "Employee", namespace = "http://www.tekup.com/xml/company")
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
