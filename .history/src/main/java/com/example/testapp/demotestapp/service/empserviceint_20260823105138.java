package com.example.testapp.demotestapp.service;

import java.util.List;
import java.util.Optional;

import com.example.testapp.demotestapp.entity.emp;

public interface empserviceint {
    List<emp> getAllEmployees();

    Optional<emp> getEmployeeById(int employeeId);

    emp createEmployee(emp employee);

    emp updateEmployee(int employeeId, emp employee);

    void deleteEmployee(int employeeId);
}
