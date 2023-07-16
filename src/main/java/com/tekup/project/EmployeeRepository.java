package com.tekup.project;
import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class EmployeeRepository {
    private static final Map<String, Employee> employees = new HashMap<>();
    @PostConstruct
    public void initData() {
        Employee employee = new Employee();
        employee.setAddress("180 rue 15 octobre");
        employee.setFirstName("Baha");
        employee.setLevel("Level 12");
        employee.setLastName("chammakhi");
        employee.setSalary(125800);
        employees.put(employee.getFirstName(), employee);

        employee = new Employee();
        employee.setAddress("Ariana");
        employee.setFirstName("Ahmed");
        employee.setLevel("Level 18");
        employee.setLastName("chammakhi");
        employee.setSalary(12381);
        employees.put(employee.getFirstName(), employee);
    }
    public Employee findEmployee(String firstName) {
        Assert.notNull(firstName, "Employee firstName must not be null");
        return employees.get(firstName);
    }

    public void createEmployee(Employee employee) {
        Assert.notNull(employee, "Employee must not be null");
        Assert.hasText(employee.getFirstName(), "Employee firstName must not be empty");
        employees.put(employee.getFirstName(), employee);
    }

    public void updateEmployee(String firstName, Employee updatedEmployee) {
        Assert.notNull(firstName, "Employee firstName must not be null");
        Assert.notNull(updatedEmployee, "Updated employee must not be null");
        Assert.hasText(updatedEmployee.getFirstName(), "Updated employee firstName must not be empty");
        employees.put(firstName, updatedEmployee);
    }

    public void deleteEmployee(String firstName) {
        Assert.notNull(firstName, "Employee firstName must not be null");
        employees.remove(firstName);
    }
}
