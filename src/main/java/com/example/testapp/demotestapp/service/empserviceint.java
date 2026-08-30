package com.example.testapp.demotestapp.service;

import java.util.List;
import java.util.Optional;

import com.example.testapp.demotestapp.entity.emp;

public interface empserviceint {
    List<emp> getAllEmployees();

    public Optional<emp> getEmployeeById(Long id);

    emp createEmployee(emp employee);

    void deleteEmployee(int employeeId);

    emp updateEmployee(Long id, emp employee);

    List<emp> findByDeptId(Long deptId);
}
