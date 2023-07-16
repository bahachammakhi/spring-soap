package com.tekup.project;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateEmployeeRequest", namespace = "http://www.tekup.com/xml/company")
public class UpdateEmployeeRequest {
    private String firstName;
    private String newFirstName;
    private String lastName;
    private String address;
    private String level;
    private int salary;

    public String getFirstName() {
        return firstName;
    }

    @XmlElement(name = "firstName", namespace = "http://www.tekup.com/xml/company")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNewFirstName() {
        return newFirstName;
    }

    @XmlElement(name = "newFirstName", namespace = "http://www.tekup.com/xml/company")
    public void setNewFirstName(String newFirstName) {
        this.newFirstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement(name = "lastName", namespace = "http://www.tekup.com/xml/company")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement(name = "address", namespace = "http://www.tekup.com/xml/company")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevel() {
        return level;
    }

    @XmlElement(name = "level", namespace = "http://www.tekup.com/xml/company")
    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    @XmlElement(name = "salary", namespace = "http://www.tekup.com/xml/company")
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
