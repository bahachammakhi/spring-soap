package com.tekup.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class EmployeeEndPoint {
    private static final String NAMESPACE_URI = "http://www.tekup.com/xml/company";
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeEndPoint(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeDetailsRequest")
    @ResponsePayload
    public EmployeeDetailsResponse getEmployee(@RequestPayload EmployeeDetailsRequest request) {
        EmployeeDetailsResponse response = new EmployeeDetailsResponse();
        response.setEmployee(employeeRepository.findEmployee(request.getFirstname()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateEmployeeRequest")
    @ResponsePayload
    public UpdateEmployeeResponse createEmployee(@RequestPayload CreateEmployeeRequest request) {
        UpdateEmployeeResponse response = new UpdateEmployeeResponse();
        Employee employee = new Employee();
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setAddress(request.getAddress());
        employee.setLevel(request.getLevel());
        employee.setSalary(request.getSalary());
        employeeRepository.createEmployee(employee);
        response.setMessage("Employee created successfully");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateEmployeeRequest")
    @ResponsePayload
    public UpdateEmployeeResponse updateEmployee(@RequestPayload UpdateEmployeeRequest request) {
        UpdateEmployeeResponse response = new UpdateEmployeeResponse();
        String firstName = request.getFirstName();
        Employee existingEmployee = employeeRepository.findEmployee(firstName);
        if (existingEmployee != null) {
            Employee updatedEmployee = new Employee();
            updatedEmployee.setFirstName(request.getNewFirstName());
            updatedEmployee.setLastName(request.getLastName());
            updatedEmployee.setAddress(request.getAddress());
            updatedEmployee.setLevel(request.getLevel());
            updatedEmployee.setSalary(request.getSalary());
            employeeRepository.updateEmployee(firstName, updatedEmployee);
            response.setMessage("Employee updated successfully");
        } else {
            response.setMessage("Employee not found");
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteEmployeeRequest")
    @ResponsePayload
    public UpdateEmployeeResponse deleteEmployee(@RequestPayload DeleteEmployeeRequest request) {
        UpdateEmployeeResponse response = new UpdateEmployeeResponse();
        String firstName = request.getFirstName();
        Employee existingEmployee = employeeRepository.findEmployee(firstName);
        if (existingEmployee != null) {
            employeeRepository.deleteEmployee(firstName);
            response.setMessage("Employee deleted successfully");
        } else {
            response.setMessage("Employee not found");
        }
        return response;
    }
}
