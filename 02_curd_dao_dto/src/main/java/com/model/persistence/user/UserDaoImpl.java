package com.model.persistence.user;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.exceptions.UserNotFoundException;
import com.model.persistence.factory.HibernateSessionFactory;

public class UserDaoImpl implements UserDao{

private SessionFactory factory;
	
	public UserDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}
	
	@Override
	public void addUser(User user) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(user);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		session.close();
	}

	@Override
	public Optional<User> getUser(String username, String password) throws UserNotFoundException {
		User user = null;
		Session session = factory.openSession();
		
		List<User> users = session
				.createQuery("select u from User u where u.username=:username and u.password=:password", User.class)
				.setParameter("username", username)
				.setParameter("password", password)
				.getResultList();
		
		session.close();
		return Optional.ofNullable(users.get(0));
	}

}
