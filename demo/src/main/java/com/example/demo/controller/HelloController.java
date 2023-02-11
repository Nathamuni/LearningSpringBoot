package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//     👇 whenever we wanna execute any request we map..
@RequestMapping(value= "/",method =  RequestMethod.GET)
 // or  @GetMapping("/")    works the same
    public String helloWorld(){
        return  "Vankkam makkaleeee ";
    }
}
