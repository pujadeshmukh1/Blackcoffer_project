package com.Blackcoffer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blackcoffer.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
