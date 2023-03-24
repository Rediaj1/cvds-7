package com.jaider.gonzalez.springboot.jpamediumdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
	
}