package com.rest.template.controllers;
 
import java.util.concurrent.Future;
 
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class RestTemplateController {
 
    @GetMapping("/hola")
    public String hola() {
        return "hola";
    }
 
}

