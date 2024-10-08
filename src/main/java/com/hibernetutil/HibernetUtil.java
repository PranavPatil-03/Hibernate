package com.hibernetutil;



import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import com.main.Employe;

import com.onetoone.StudentDetails;
import com.onetoone.Student_Address;

public class HibernetUtil {
private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null) {
			Configuration configuration=new Configuration();
			Properties properties=new Properties();
			
			properties.put(Environment.DRIVER ,"com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL ,"jdbc:mysql://localhost:3306/student");
			properties.put(Environment.USER ,"root");
			properties.put(Environment.PASS,"root");
			properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO,"create");
			properties.put(Environment.SHOW_SQL ,true);
			
			configuration.setProperties(properties);
		    //Employee
		//configuration.addAnnotatedClass(Employe.class);
			//OneToOne
			configuration.addAnnotatedClass(StudentDetails.class);
			configuration.addAnnotatedClass(Student_Address.class);
			
			
			
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory=configuration.buildSessionFactory(serviceRegistry);
			
			
		}
		
		return sessionFactory;
	}
	
}
