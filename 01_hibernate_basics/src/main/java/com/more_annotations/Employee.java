package com.more_annotations;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "emp_table_more_anno2")
public class Employee {

	@Column(name = "emp_id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "emp_ename", nullable = false, length = 100)
	private String ename;

	@Column(name = "emp_city", nullable = true, length = 100)
	private String city;

	@Column(name = "emp_desi", nullable = false, length = 100)
	private String desi;

	@Column(name = "emp_salary", nullable = false, length = 100)
	private double salary;

	@Column(name = "emp_email", nullable = false, length = 100)
	private String email;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Basic(fetch =FetchType.LAZY )
	@Temporal(TemporalType.TIMESTAMP)
	private Date punchDate;

	@Transient
	private String tempPassword;

	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getPunchDate() {
		return punchDate;
	}

	public void setPunchDate(Date punchDate) {
		this.punchDate = punchDate;
	}

	public String getTempPassword() {
		return tempPassword;
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	public Employee(String ename, String city, String desi, double salary, String email, Date dob) {

		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
		this.email = email;
		this.dob = dob;
	}

	public Employee() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Employee [id=" + id + ", ename=" + ename + ", city=" + city + ", desi=" + desi + ", salary=" + salary
				+ ", email=" + email + "]";
	}

}