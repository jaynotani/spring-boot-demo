package io.jay;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	String name;
	@Id
	String rollNo;
	
	public Student(){
		
	}
	public Student(String name, String rollNo){
		super();
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
