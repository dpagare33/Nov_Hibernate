package com.jbk.controller.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.controller.Entity.Product;

public class Config {

	
	public static SessionFactory getSessionFactory() {
	
		Configuration configuration=new Configuration();

		configuration.configure().addAnnotatedClass(Product.class);
	
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
	
		 return sessionFactory;
	
	}
}
