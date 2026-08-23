package com.example.testapp.demotestapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.demotestapp.entity.emp;
import com.example.testapp.demotestapp.service.empserviceint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/employees")
public class empcontroller {
    private final empserviceint empService;

    public empcontroller(empserviceint empService) {
        this.empService = empService;
    }

    @GetMapping("/getallemp")
    public List<emp> getMethodName(@RequestParam String param) {
        return empService.getAllEmployees();
    }

    // Implement the RESTful endpoints for employee operations here
}
