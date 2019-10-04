package com.abhay.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abhay.model.Address;
import com.abhay.model.Employee;

@Repository
@Transactional
public class AddressDaoImp implements AddressDao {

	@Autowired
	private SessionFactory sessionFactory;


	public void add(Address a) {

		sessionFactory.getCurrentSession().save(a);

	}

	public void remove(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(Address a) {
		// TODO Auto-generated method stub

	}

	public List<Employee> view() {

			org.hibernate.Session session =  this.sessionFactory.openSession();
			List<Employee> employeeList = session.createQuery("from Address").list();
					session.close();
			return employeeList;
			
	}

	

}
