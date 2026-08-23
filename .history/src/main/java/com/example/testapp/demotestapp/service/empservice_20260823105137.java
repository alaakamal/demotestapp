package com.example.testapp.demotestapp.service;

import java.util.List;
import java.util.Optional;

import com.example.testapp.demotestapp.entity.emp;
import com.example.testapp.demotestapp.repository.emprepo;

public class empservice implements empserviceint {
    // Implement the methods defined in the empserviceint interface
    private final emprepo empRepository;

    public empservice(emprepo empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public List<emp> getAllEmployees() {
        return empRepository.findAll();
    }

    @Override
    public Optional<emp> getEmployeeById(int employeeId) {
        return empRepository.findById((long) employeeId);

    }

    @Override
    public emp createEmployee(emp employee) {
        return empRepository.save(employee);
    }

    @Override
    public emp updateEmployee(int employeeId, emp employee) {
        return empRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        empRepository.deleteById((long) employeeId);
    }

}
