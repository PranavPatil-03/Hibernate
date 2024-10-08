package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentDetails {
    @Id
	private int stu_id;
	
	private String stu_name;
	
	private double stu_mob_no;
	@OneToOne
	private Student_Address stu_add;

	public Student_Address getStu_add() {
		return stu_add;
	}

	public void setStu_add(Student_Address stu_add) {
		this.stu_add = stu_add;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public double getStu_mob_no() {
		return stu_mob_no;
	}

	public void setStu_mob_no(int stu_mob_no) {
		this.stu_mob_no = stu_mob_no;
	}
	
}
