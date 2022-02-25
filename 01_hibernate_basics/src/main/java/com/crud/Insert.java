package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Insert {

	public static void main(String[] args) {

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();

		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			
			tx.begin();
			
			Employee employee = new Employee("sumit", "noida", "Sales", 97000.00, "ravi@gmail.com");
			Integer id=(Integer) session.save(employee);	//save()	vs	persist()
			
			//Student student=new Student("amit", "noida", "Sales", 97000.00, "ravi@gmail.com");
			//Integer id=(Integer) session.save(student);
			System.out.println(id);
			
			tx.commit();
			
		}catch(HibernateException ex) {
			
			tx.rollback();
		}
		

		
		session.close();
///
		factory.close();

	}

}