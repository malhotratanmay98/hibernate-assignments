package com.model.persistence.employee;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.exceptions.DataAccessException;
import com.model.exceptions.EmployeeNotFoundException;
import com.model.persistence.factory.HibernateSessionFactory;

public class EmployeeDaoImpl implements EmployeeDao{

	private SessionFactory factory;
	
	public EmployeeDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(employee);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		session.close();
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			
			Employee employee = getById(id).orElseThrow(()->new EmployeeNotFoundException("Employee Not found"));
			session.delete(employee);
			
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		session.close();
	}

	@Override
	public Employee updateEmployee(int id, Employee emp) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		Employee employee=null;
		try {
			tx.begin();
			
			employee = getById(id).orElseThrow(()->new EmployeeNotFoundException("Employee Not found"));
			employee.setSalary(emp.getSalary());
			employee.setDesi(emp.getDesi());
			session.update(employee);
			
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		session.close();
		return employee;
	}

	@Override
	public List<Employee> getAll() throws DataAccessException {
		Session session = factory.openSession();
		List<Employee> employees = session.createQuery("select e from Employee e", Employee.class).getResultList();
		return employees;
	}

	@Override
	public Optional<Employee> getById(int id) throws EmployeeNotFoundException {
		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, id);
		session.close();
		return Optional.ofNullable(employee);
	}

}
