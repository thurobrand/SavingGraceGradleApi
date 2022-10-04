package com.savinggrace.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("HellorWorld")
    public String helloWorld(){
        return "Hello from me";
    }
}
