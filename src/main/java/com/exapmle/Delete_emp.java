package com.exapmle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernetutil.HibernetUtil;
import com.main.Employe;

public class Delete_emp {

	public static void main(String[] args) {
	SessionFactory factory=HibernetUtil.getSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Employe emp=session.get(Employe.class,14);
	System.out.println("emp_id: " + emp.getEmp_id());
	System.out.println("emp_name: " + emp.getEmp_name());
	System.out.println("emp_city: " + emp.getEmp_city());
	
	
	session.delete(emp);
	System.out.println("Employe Detils Delet Sucessfuly");
	
	tx.commit();
	session.close();
	factory.close();

	}

}
