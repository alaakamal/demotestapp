package com.example.testapp.demotestapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.testapp.demotestapp.entity.emp;
import com.example.testapp.demotestapp.repository.emprepo;

@Service
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

    public Optional<emp> getEmployeeById(Long id) {
        return empRepository.findById(id);

    }

    @Override
    public emp createEmployee(emp employee) {
        return empRepository.save(employee);
    }

    public emp updateEmployee(Long id, emp employee) {
        return empRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int employeeId) {
        empRepository.deleteById((long) employeeId);
    }

}
