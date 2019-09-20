package com.rab3.repositorys;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.rab3.entities.CustomerLoginEntity;

@Repository
public class CustomerLoginRepository {

	private SessionFactory sessionFactory;

	public void save(CustomerLoginEntity customerLogin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(customerLogin);
		session.getTransaction().commit();
		session.close();

	}

	public CustomerLoginEntity getByUsername(String userid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q = session.createQuery("From CustomerLoginEntity c1 where c1.username = :uname");
		q.setParameter("uname", userid);

		CustomerLoginEntity loginEntity = (CustomerLoginEntity) q.uniqueResult();
		session.getTransaction().commit();
		session.close();

		return loginEntity;

	}

	public void update(CustomerLoginEntity cutomerLogin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(cutomerLogin);

		session.getTransaction().commit();
		session.close();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
