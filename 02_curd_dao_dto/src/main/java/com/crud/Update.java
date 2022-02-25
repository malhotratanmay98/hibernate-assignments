package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.persistence.factory.HibernateSessionFactory;

public class Update {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			
			tx.begin();
			
			Employee employee=session.get(Employee.class, 2);
			employee.setCity("gr noida");
			employee.setCity("raxaul");
			
			employee.setSalary(87000);
			
			session.update(employee);
			tx.commit();
			
		}catch(HibernateException ex) {
			
			tx.rollback();
		}
		

		
		session.close();
		factory.close();

	}

}