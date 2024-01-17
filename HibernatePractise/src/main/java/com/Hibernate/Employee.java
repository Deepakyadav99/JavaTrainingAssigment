package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	private int emp_Id;
	private String emp_Name;
	private String emp_Qualification;
	
	@ManyToOne
	private Department department;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmp_Qualification() {
		return emp_Qualification;
	}

	public void setEmp_Qualification(String emp_Qualification) {
		this.emp_Qualification = emp_Qualification;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int emp_Id, String emp_Name, String emp_Qualification, Department department) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Qualification = emp_Qualification;
		this.department = department;
	}

	public Employee()
	{
		super();
	}
	
	
}
