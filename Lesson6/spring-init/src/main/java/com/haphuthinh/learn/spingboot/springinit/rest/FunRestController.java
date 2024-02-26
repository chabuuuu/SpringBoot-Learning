package com.haphuthinh.learn.spingboot.springinit.rest;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //GET '/' RETURN "HELLO WORLD"
    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello world";
    }
}
