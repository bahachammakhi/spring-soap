package com.tekup.project;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UpdateEmployeeResponse", namespace = "http://www.tekup.com/xml/company")
public class UpdateEmployeeResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    @XmlElement(name = "message", namespace = "http://www.tekup.com/xml/company")
    public void setMessage(String message) {
        this.message = message;
    }
}
