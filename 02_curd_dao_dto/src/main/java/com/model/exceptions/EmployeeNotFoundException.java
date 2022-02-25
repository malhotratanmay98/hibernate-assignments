package com.model.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 5869289220781395308L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}