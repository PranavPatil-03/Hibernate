package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernetutil.HibernetUtil;

public class OneToOne {

	public static void main(String[] args) {
		System.out.println( "Project Started" );
	       SessionFactory factory=HibernetUtil.getSessionFactory();
	      
	       
	       
	       Student_Address stdAddress=new Student_Address();
	       stdAddress.setId(203);
	       stdAddress.setCity("Pune");
//	     
//	     
	       StudentDetails stdDetails=new StudentDetails();
	       stdDetails.setStu_id(102);
	       stdDetails.setStu_name("Pranav");
	       stdDetails.setStu_mob_no(362541987);
	      stdDetails.setStu_add(stdAddress);
//	      
//	      
	      stdAddress.setStd_detail(stdDetails);
//	      
	      Session session=factory.openSession();
	       Transaction tx=session.beginTransaction();
	      
	      
//	       Student_Address ad=(Student_Address)session.get(Student_Address.class,202);
//	      System.out.println("Stu_name :" + ad.getCity());
//	      System.out.println("Sty_Add :" + ad.getStd_detail().getStu_name());
            session.save(stdDetails);
	       session.save(stdAddress);
//	       
	       tx.commit();
	       
	       session.close();
	       factory.close();
	}

}
