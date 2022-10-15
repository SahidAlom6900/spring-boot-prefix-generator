package com.technoelevate.generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.generator.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
