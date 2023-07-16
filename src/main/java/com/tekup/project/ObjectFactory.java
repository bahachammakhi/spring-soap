package com.tekup.project;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName EMPLOYEE_DETAILS_REQUEST_QNAME = new QName("http://www.tekup.com/xml/company", "EmployeeDetailsRequest");
    private static final QName EMPLOYEE_DETAILS_RESPONSE_QNAME = new QName("http://www.tekup.com/xml/company", "EmployeeDetailsResponse");

    public ObjectFactory() {
    }

    public EmployeeDetailsRequest createEmployeeDetailsRequest() {
        return new EmployeeDetailsRequest();
    }

    public EmployeeDetailsResponse createEmployeeDetailsResponse() {
        return new EmployeeDetailsResponse();
    }

    public Employee createEmployee() {
        return new Employee();
    }

    @XmlElementDecl(namespace = "http://www.tekup.com/xml/company", name = "EmployeeDetailsRequest")
    public JAXBElement<EmployeeDetailsRequest> createEmployeeDetailsRequest(EmployeeDetailsRequest value) {
        return new JAXBElement<>(EMPLOYEE_DETAILS_REQUEST_QNAME, EmployeeDetailsRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.tekup.com/xml/company", name = "EmployeeDetailsResponse")
    public JAXBElement<EmployeeDetailsResponse> createEmployeeDetailsResponse(EmployeeDetailsResponse value) {
        return new JAXBElement<>(EMPLOYEE_DETAILS_RESPONSE_QNAME, EmployeeDetailsResponse.class, null, value);
    }
}
