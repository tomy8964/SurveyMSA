package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo1Controller {

    @GetMapping("/resource")
    public String getResource() {
        // Perform some logic to retrieve the desired resource
        String resource = "This is the resource from Demo1";

        return resource;
    }
}
