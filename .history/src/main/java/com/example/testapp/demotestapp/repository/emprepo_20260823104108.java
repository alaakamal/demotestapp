package com.example.testapp.demotestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testapp.demotestapp.entity.emp;

public interface emprepo extends JpaRepository<emp, Long> {

}
