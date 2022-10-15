package com.technoelevate.generator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.generator.dto.EmployeeDto;
import com.technoelevate.generator.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@PostMapping
	public String addEmployee(@RequestBody EmployeeDto employeeDto) {
		return	employeeService.addEmployee(employeeDto);
	}

}
