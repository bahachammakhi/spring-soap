package com.tekup.project;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeleteEmployeeRequest", namespace = "http://www.tekup.com/xml/company")
public class DeleteEmployeeRequest {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    @XmlElement(name = "firstName", namespace = "http://www.tekup.com/xml/company")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
