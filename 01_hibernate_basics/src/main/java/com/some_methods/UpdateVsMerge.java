package com.some_methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class UpdateVsMerge {

	public static void main(String[] args) throws ParseException {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		//NonUniqueObjectException?
		
		// ----session1---------------
		Session session = factory.openSession();

		Employee employee = session.get(Employee.class, 1L);
		employee.setCity("NY-3");
		employee.setEmail("foo@foo.com");

		session.close();

		// ----session2---------------
		Session session2 = factory.openSession();

		session2.getTransaction().begin();
		Employee employee2 = session2.get(Employee.class, 1L);
		employee.setCity("Chennai-3");
		
		session2.merge(employee);
		session2.getTransaction().commit();
		session2.close();

		factory.close();

	}

}