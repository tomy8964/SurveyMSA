package com.example.demo2;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Demo2Controller {

    @Autowired
    private final Demo2Service demo2Service;

    @GetMapping(value = "/api")
    public Survey getResource() {
        return demo2Service.getDemo1();
    }
}
