package com.emp.repositories;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.emp.entities.EmployeeLoginEntity;

@Repository
public class EmployeeLoginRepository {

	private SessionFactory sessionFactory;

	public void save(EmployeeLoginEntity employeeLogin) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employeeLogin);
		session.getTransaction().commit();
		session.close();
	}

	public EmployeeLoginEntity getByUsername(String userid) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q = session.createQuery("From EmployeeLoginEntity e where e.name = :uname");
		q.setParameter("uname", userid);

		EmployeeLoginEntity loginEntity = (EmployeeLoginEntity) q.uniqueResult();
		session.getTransaction().commit();
		session.close();

		return loginEntity;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
