package com.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration();
    	con.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
    	SessionFactory factory = con.buildSessionFactory();	
    	
    	Department d = new Department();
    	d.setDepartment_Id(1);
    	d.setDepartment_Name("Java Developer");
    	
    	Employee e1 = new Employee();
    	e1.setEmp_Id(1);
    	e1.setEmp_Name("Deepak");
    	e1.setEmp_Qualification("MCA");
    	
    	Employee e2 = new Employee();
    	e2.setEmp_Id(2);
    	e2.setEmp_Name("Kiran");
    	e2.setEmp_Qualification("BCA");
    	
    	Employee e3 = new Employee();
    	e3.setEmp_Id(3);
    	e3.setEmp_Name("Akshay");
    	e3.setEmp_Qualification("B.Tech");
    	
    	List<Employee> list= new ArrayList<Employee>(); 
        list.add(e1);
        list.add(e2);
        list.add(e3);
	     d.setEmployee(list);
	     e1.setDepartment(d);
	     e2.setDepartment(d);
	     e3.setDepartment(d);
	     
	     Session session = factory.openSession();
		 Transaction transaction = session.beginTransaction();
			
			session.save(d);
			session.save(e1);
			session.save(e2);
			session.save(e3);
			transaction.commit();
			session.close();
			factory.close();	
    }
}
