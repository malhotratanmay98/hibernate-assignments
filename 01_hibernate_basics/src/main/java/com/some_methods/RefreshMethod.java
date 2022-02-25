package com.some_methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class RefreshMethod {

	public static void main(String[] args) throws ParseException {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();

		Employee employee = session.get(Employee.class, 1L);
		
		System.out.println(employee);
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			
		}
		
		session.refresh(employee);
		
		System.out.println(employee);
		
		session.close();

		factory.close();

	}

}