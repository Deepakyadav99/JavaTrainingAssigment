package com.src.emp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

public class EmployeeStore {

	public static void main(String[] args) {

		/*
		 * Configuration configuration = new Configuration().configure(); SessionFactory
		 * sessionFactory = configuration.buildSessionFactory(); Session session =
		 * sessionFactory.openSession(); Transaction t = session.beginTransaction();
		 */

		
		 StandardServiceRegistry ssr = new
		 StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		  
		 SessionFactory factory = meta.getSessionFactoryBuilder().build(); Session
		 session = factory.openSession(); Transaction t = session.beginTransaction();
		 
		 Criteria c = session.createCriteria(Employee.class);
		  c.add(Restrictions.eq("firstName", "kiran"));
		  
		  List<Employee> l = c.list();
		  
		  
		  for(Employee emp:l) {
		  
		  System.out.println(emp);
		  
		  }
			/*
			 * Employee e1 = new Employee(); e1.setId(1); e1.setFirstName("Deepak");
			 * e1.setLastName("Yadav"); e1.setSalary(45000.00);
			 */

			/* session.save(e1); */
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}