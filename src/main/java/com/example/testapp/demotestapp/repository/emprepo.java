package com.example.testapp.demotestapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testapp.demotestapp.entity.emp;

public interface emprepo extends JpaRepository<emp, Long> {
    List<emp> findByDepartmentId(Long deptId);

    // Custom JPQL when names get unwieldy
    @org.springframework.data.jpa.repository.Query("SELECT e FROM emp e WHERE e.salary > :min ORDER BY e.salary DESC")
    List<emp> topEarners(double min);
}
