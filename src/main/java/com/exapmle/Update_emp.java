package com.exapmle;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernetutil.HibernetUtil;
import com.main.Employe;

public class Update_emp {
	public static void main (String[]args) {
	SessionFactory factory = HibernetUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Employe emp=session.get(Employe.class, 7);
	emp.setEmp_id(4);
	emp.setEmp_name("Mansi");
	emp.setEmp_city("Odisa");
	session.save(emp);
	System.out.println("Employee Detils Update Sucessfully");
	tx.commit();
	session.close();
	}
}
