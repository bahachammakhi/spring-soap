package com.tekup.project;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployeeDetailsRequest", namespace = "http://www.tekup.com/xml/company")
public class EmployeeDetailsRequest {

    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    @XmlElement(name = "firstname", namespace = "http://www.tekup.com/xml/company")
    public void setFirstname(String firstname) {
        System.out.println(firstname);
        this.firstname = firstname;
    }

}
