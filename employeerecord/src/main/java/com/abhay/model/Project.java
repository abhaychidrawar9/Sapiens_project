package com.abhay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue
	private Integer projectId;
	private String projectTitle;
	
	@ManyToOne
	private Employee employee;
	private Integer Duration;
	
	private String currentStatus;

	
	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getDuration() {
		return Duration;
	}

	public void setDuration(Integer duration) {
		Duration = duration;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", employee=" + employee + ", Duration=" + Duration
				+ ", currentStatus=" + currentStatus + "]";
	}
	
	
	


}
