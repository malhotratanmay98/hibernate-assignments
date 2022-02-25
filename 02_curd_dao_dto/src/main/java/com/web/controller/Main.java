package com.web.controller;

import java.util.Optional;

import com.model.exceptions.UserNotFoundException;
import com.model.persistence.employee.Employee;
import com.model.persistence.user.User;
import com.model.service.employee.EmployeeService;
import com.model.service.employee.EmployeeServiceImpl;
import com.model.service.user.UserService;
import com.model.service.user.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
//		userService.addUser(new User("raj"	, "raj123", "admin"));
//		userService.addUser(new User("yash"	, "yash", "admin"));
		
//		Optional<User> userOpt=userService.getUser("raj", "raj123");
//		System.out.println(userOpt.orElseThrow(()-> new UserNotFoundException("user not found")));
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.addEmployee(new Employee("amit", "noida", "sales", 45000));
		
	}
}
