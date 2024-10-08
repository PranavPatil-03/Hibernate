package com.exapmle;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernetutil.HibernetUtil;
import com.main.Employe;

public class Retrivie_emp {

	public static void main(String[] args) {
		SessionFactory factory=HibernetUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
////		Optional.ofNullable(session.get(Employe.class,4))
////		. ifPresent(emp -> {
////			  System.out.println("emp_id: " + emp.getEmp_id());
////              System.out.println("emp_name: " + emp.getEmp_name());
////              System.out.println("emp_city: " + emp.getEmp_city());
//		}
//         );
		
		Employe emp=(Employe) session.get(Employe.class,4);
		System.out.println("emp_id: " + emp.getEmp_id());
		System.out.println("emp_name: " + emp.getEmp_name());
		System.out.println("emp_city: " + emp.getEmp_city());
		System.out.println("Employe Detils Retrived Sucessfully");
		tx.commit();
		session.close();
		factory.close();
	}

}
//System.out.println( emp.getEmpState().getState());
