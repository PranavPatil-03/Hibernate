package com.main;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employe_Detail")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
   
    private String emp_name;
  
    private String emp_city;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	@Override
	public String toString() {
		return "Employe [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + "]";
	}
	
}
