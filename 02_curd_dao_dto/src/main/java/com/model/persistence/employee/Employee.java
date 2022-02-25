package com.model.persistence.employee;
//Data Transfer Object - DTO

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
	
	@Column(name="emp_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ename;
	private String city;
	private String desi;
	private double salary;
	public Employee() {}
	
	public Employee(String ename, String city, String desi, double salary) {
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
	}

	public Employee(Integer id, String ename, String city, String desi, double salary) {
		this.id = id; 
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", ename=").append(ename).append(", city=").append(city)
				.append(", desi=").append(desi).append(", salary=").append(salary).append("]");
		return builder.toString();
	}
	
}
