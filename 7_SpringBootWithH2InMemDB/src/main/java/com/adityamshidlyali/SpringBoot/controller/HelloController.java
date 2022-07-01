package com.adityamshidlyali.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // for GET requests the @GetMapping annotation available and for POST requests @PostMapping is available
    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
}
