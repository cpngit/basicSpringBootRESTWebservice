package com.cpn.spring.rest.webservice.basicSpringBootRESTWebservice.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthDate;

    public Integer getId() {
        return id;
    }

    public User(Integer id, String name, Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }



}