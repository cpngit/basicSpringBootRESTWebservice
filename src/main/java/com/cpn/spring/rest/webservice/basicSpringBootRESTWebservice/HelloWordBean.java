package com.cpn.spring.rest.webservice.basicSpringBootRESTWebservice;

public class HelloWordBean {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    @Override
    public String toString() {
        return "HelloWordBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloWordBean(String message) {
        this.message = message;
    }
}
