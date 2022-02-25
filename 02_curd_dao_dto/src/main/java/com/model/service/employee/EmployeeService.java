package com.model.service.employee;

import java.util.List;
import java.util.Optional;

import com.model.exceptions.DataAccessException;
import com.model.exceptions.EmployeeNotFoundException;
import com.model.persistence.employee.Employee;

public interface EmployeeService{
	public Employee addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee updateEmployee(int id,Employee employee);
	public List<Employee> getAll() throws DataAccessException;
	public Optional<Employee> getById(int id) throws EmployeeNotFoundException;
}
