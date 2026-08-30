package com.example.testapp.demotestapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testapp.demotestapp.entity.emp;
import com.example.testapp.demotestapp.service.empserviceint;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/employees")
public class empcontroller {
    private final empserviceint empService;

    public empcontroller(empserviceint empService) {
        this.empService = empService;
    }

    @GetMapping("/getallemp")
    public List<emp> getMethodName() {
        return empService.getAllEmployees();
    }

    @GetMapping("/getempbyid/{id}")
    public emp getMethodName(@PathVariable Long id) {
        return empService.getEmployeeById(id)
                .orElseThrow(() -> {
                    return new RuntimeException(
                            "Employee not found with id: " + id);
                });
    }

    @GetMapping("/getbydeptid/{depid}")
    public List<emp> getdept(@PathVariable Long deptid) {
        return empService.findByDeptId(deptid);
    }

    @PutMapping("/updateempbyid/{id}")
    public emp postMethodName(@PathVariable Long id,
            @RequestBody emp employee) {
        return empService.updateEmployee(
                id,
                employee);
    }

    @PostMapping("/addemp")
    public emp postMethodName(@RequestBody emp employee) {
        return empService.createEmployee(employee);
    }

    @DeleteMapping("/deleteemp/{id}")
    public void deleteEmployee(
            @PathVariable Long id) {
        employeeService.deleteEmployee(id);

    }
    // Implement the RESTful endpoints for employee operations here
}
