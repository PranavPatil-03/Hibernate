package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student_Address {
	@Id
	private int id;
	
	private String city;
	@OneToOne(mappedBy ="stu_add")
	private StudentDetails std_detail;

	public StudentDetails getStd_detail() {
		return std_detail;
	}

	public void setStd_detail(StudentDetails std_detail) {
		this.std_detail = std_detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
