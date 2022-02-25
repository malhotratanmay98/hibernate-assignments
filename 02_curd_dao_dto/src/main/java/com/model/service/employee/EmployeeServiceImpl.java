package com.model.service.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.model.exceptions.DataAccessException;
import com.model.exceptions.EmployeeNotFoundException;
import com.model.persistence.employee.Employee;
import com.model.persistence.employee.EmployeeDao;
import com.model.persistence.employee.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public Employee addEmployee(Employee employee) {		
		return employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		return employeeDao.updateEmployee(id, employee);
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		List<Employee> employees = new ArrayList<>();
		employees = employeeDao.getAll();
		return employees;
	}

	@Override
	public Optional<Employee> getById(int id) throws EmployeeNotFoundException {
		Optional<Employee> employee = employeeDao.getById(id);
		return employee;
	}

}
