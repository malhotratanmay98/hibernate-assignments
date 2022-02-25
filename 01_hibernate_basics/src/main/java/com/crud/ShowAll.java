package com.crud;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.factory.HibernateSessionFactory;

public class ShowAll {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		//SQL====HQL(hibernate query language)
		
		List<EmpData> employees=session
				.createQuery("select new com.crud.EmpData(e.ename, e.salary) from Employee e", EmpData.class)
				.getResultList();
		
		employees.stream().forEach(e-> System.out.println(e));
		
		
		
//		List<EmpData>employees=session
//				.createQuery("select new com.demo.EmpData(e.ename,e.salary) from Employee e")
//				.getResultList();
//	
//		
//		employees.stream().forEach(e-> System.out.println(e));
		
		
//		List<Object[]>employees=session
//				.createQuery("select e.ename,e.salary from Employee e")
//				.getResultList();
//		
//		for(Object[] arr: employees) {
//			System.out.println(arr[0]+ ": "+ arr[1]);
//		}
//		
//		
//		List<Employee>employees=session
//				.createQuery("select e from Employee e", Employee.class)
//				.getResultList();
//		
//		employees.forEach(e-> System.out.println(e));
		session.close();
///
		factory.close();

	}

}