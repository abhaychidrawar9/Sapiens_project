package com.abhay.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abhay.model.Project;

@Repository
@Transactional
public class ProjectDaoImp implements ProjectDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Project p) {
		sessionFactory.getCurrentSession().save(p);
	}

	public List<Project> view() {
			Session s = sessionFactory.getSessionFactory().openSession();
			
			
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer pid) {
		// TODO Auto-generated method stub
		
	}

	public void update(Project e) {
		// TODO Auto-generated method stub
		
	}

}
