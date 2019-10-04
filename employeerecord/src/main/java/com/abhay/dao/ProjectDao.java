package com.abhay.dao;

import java.util.List;

import com.abhay.model.*;

public interface ProjectDao {
	
	public List<Project> view();
	
	public void add(Project p);
	
	public void update(Project p);

	public void remove(Integer id);
}
