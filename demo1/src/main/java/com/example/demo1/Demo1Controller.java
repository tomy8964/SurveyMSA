package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo1Controller {

    @GetMapping("/resource")
    public Survey getResource() {
        // Perform some logic to retrieve the desired resource
        Survey resource = new Survey().builder()
                .id(1L)
                .acceptResponse(true)
                .title("Survey Title")
                .url("http://www.demo1.com")
                .countAnswer(0)
                .description("Survey Description")
                .build();

        return resource;
    }
}
