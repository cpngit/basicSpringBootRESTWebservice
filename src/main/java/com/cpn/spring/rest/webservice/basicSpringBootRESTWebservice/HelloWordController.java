package com.cpn.spring.rest.webservice.basicSpringBootRESTWebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWordBean helloWorldBean(){
        return new HelloWordBean("Hello World");
    }
}
