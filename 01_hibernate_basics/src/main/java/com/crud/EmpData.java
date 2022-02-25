package com.crud;

public class EmpData {
	private String ename;
	private double salary;
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmpData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpData(String ename, double salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpData [ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	

}