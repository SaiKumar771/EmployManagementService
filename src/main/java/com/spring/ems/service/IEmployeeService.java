package com.spring.ems.service;

import java.util.List;

import com.spring.ems.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Long id);
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Long id);
	
	public void deleteEmployee(Long id);
	
	

}
