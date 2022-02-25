package com.more_annotations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class Main {
	
	
	public static void main(String[] args) throws ParseException {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		Session sesssion= factory.openSession();
		
		Date dob=new SimpleDateFormat("dd/MM/yyyy").parse("11/11/2000");
		
		Employee employee=new Employee("seema", "delhi", "sales", 3000, "raja@gmail.com", dob);
		employee.setPunchDate(new Date());
		employee.setTempPassword("43434dffdffdd");
		employee.setGender(Gender.FEMALE);
		Transaction tx=sesssion.getTransaction();
		try {
			
			tx.begin();
			
			sesssion.save(employee);
			
			tx.commit();
	
		}catch(HibernateException ex) {
			System.out.println(ex);
			tx.rollback();
		}
		
		sesssion.close();
		factory.close();
		
		
	}

}