package com.example.testapp.demotestapp.service;

public interface empserviceint {
    List<emp> getAllEmployees();

    emp getEmployeeById(int employeeId);

    emp createEmployee(emp employee);

    emp updateEmployee(int employeeId, emp employee);

    void deleteEmployee(int employeeId);
}
