package com.abhay.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhay.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImp implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Employee> view() {
		
		return null;
	}

	
	public String add(Employee e) {
		sessionFactory.getCurrentSession().save(e);
		List<Employee> el = sessionFactory.getCurrentSession().createQuery("from Employee where id in (select max(id) from Employee)").list();  
		return "Done";
	}

	public void update(Employee e) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
