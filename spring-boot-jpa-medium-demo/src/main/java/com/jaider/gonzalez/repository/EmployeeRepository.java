package com.jaider.gonzalez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.jaider.gonzalez.modelo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
	
}