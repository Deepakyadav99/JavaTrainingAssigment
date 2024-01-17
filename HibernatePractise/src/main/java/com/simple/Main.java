package com.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main 
{
	public static void main(String[] args) 
	{
		Configuration con= new Configuration();
		Configuration conf = con.configure();
		SessionFactory sessionFactory = conf.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();

		Student ss=new Student(1, "Deepak", "Mumbai");
		
		session.save(ss);
		
		
		trans.commit();
		session.close();
		sessionFactory.close();
	}

}
