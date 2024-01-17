package com.Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department
{
	@Id
	private int department_Id;
	private String department_Name;

	@OneToMany(mappedBy = "department")
	private List<Employee> employee;

	public int getDepartment_Id() {
		return department_Id;
	}

	public void setDepartment_Id(int department_Id) {
		this.department_Id = department_Id;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department(int department_Id, String department_Name, List<Employee> employee) 
	{
		super();
		this.department_Id = department_Id;
		this.department_Name = department_Name;
		this.employee = employee;
	}

	public Department()
	{
		super();
	}	
}
