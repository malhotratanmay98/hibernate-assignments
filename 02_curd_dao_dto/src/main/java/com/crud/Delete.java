package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.persistence.factory.HibernateSessionFactory;


public class Delete {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			
			tx.begin();
			
			Employee employee=session.get(Employee.class, 1);
			System.out.println("-----------------");
			if(employee!=null)
			session.delete(employee);
			
			tx.commit();
			
		}catch(HibernateException ex) {
			
			tx.rollback();
		}	
		session.close();
		factory.close();

	}

}