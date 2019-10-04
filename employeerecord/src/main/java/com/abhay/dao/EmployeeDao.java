package com.abhay.dao;

import java.util.List;

import com.abhay.model.Employee;

public interface EmployeeDao {
	public List<Employee> view();
	
	public String add(Employee e);
	
	public void update(Employee e);
	
	public void remove(Integer id);
	}

