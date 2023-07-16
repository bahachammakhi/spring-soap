package com.tekup.project;

import org.springframework.stereotype.Component;


public class Employee {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getLevel() {
        return level;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    String firstName;
    String lastName;
    String address;
    String level;
    Integer salary;
}
