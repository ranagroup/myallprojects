package com.emp.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.emp.entities.EmployeeEntity;

@Repository
public class EmployeeRepository {
	private SessionFactory sessionFactory;

	public void save(EmployeeEntity employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();

	}

	public List<EmployeeEntity> getCustomerByName(String name) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("from EmployeeEntity e where e.name =:namePmr");
		query.setParameter("namePmr", name);
		List<EmployeeEntity> empList = query.list();

		session.getTransaction().commit();
		session.close();
		return empList;

	}

	public EmployeeEntity getEmployeeById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction().commit();
		EmployeeEntity emp = (EmployeeEntity) session.get(EmployeeEntity.class, id);
		session.getTransaction().commit();
		session.close();
		return emp;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
