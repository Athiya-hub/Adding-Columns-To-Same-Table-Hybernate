package com.athiya.hyb1.hybernateprojectexample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pojo {

	@Id
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	private Name name;
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pojo [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
