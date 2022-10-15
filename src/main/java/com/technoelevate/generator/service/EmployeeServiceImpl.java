package com.technoelevate.generator.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.technoelevate.generator.dto.EmployeeDto;
import com.technoelevate.generator.entity.Employee;
import com.technoelevate.generator.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(EmployeeDto employeeDto) {
		System.out.println(employeeDto);
		Employee employee=new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		Employee employee2 = employeeRepository.saveAndFlush(employee);
		return employee2.getEmpid();
	}

}
