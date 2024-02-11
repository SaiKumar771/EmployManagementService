package com.spring.ems.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ems.entity.Employee;
import com.spring.ems.exception.DataNotFoundException;
import com.spring.ems.repository.IEmployeeRepository;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Employee updateEmployee(Long id) {
		Employee employee = empRepo.findById(id)
		.orElseThrow(() -> new DataNotFoundException("Employee not exist with id :" + id));
		return empRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		Employee employee = empRepo.findById(id)
		.orElseThrow(() -> new DataNotFoundException("Employee not exist with id :" + id));
		empRepo.delete(employee);
	}

}

