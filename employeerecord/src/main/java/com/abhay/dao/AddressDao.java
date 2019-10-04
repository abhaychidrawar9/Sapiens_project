package com.abhay.dao;



import java.util.List;

import com.abhay.model.Address;
import com.abhay.model.Employee;



public interface AddressDao {
	
	public List<Employee> view();
	
	public void add(Address a);
	
	public void update(Address a);
	
	public void remove(Integer id);

}
