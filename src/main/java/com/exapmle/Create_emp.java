package com.exapmle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernetutil.HibernetUtil;

import com.main.Employe;
	
public class Create_emp 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
       SessionFactory factory=HibernetUtil.getSessionFactory();
       
       
      
      
       Employe emp=new Employe();
       emp.setEmp_id(3);
       emp.setEmp_name("Surabhi");
       emp.setEmp_city("Mumbai");
      

       
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
     
       session.save(emp);
     
       tx.commit();
       session.close();
       
       System.out.println("Employee Added Sucessfully");
       factory.close();
    }  
        
}
