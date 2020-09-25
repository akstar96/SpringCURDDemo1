package com.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id 
   private int id;
   @Override
	public String toString() {
		return "Emp [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", department=" + department
				+ ", salary=" + salary + ", PNo=" + PNo + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getPNo() {
		return PNo;
	}
	public void setPNo(int pNo) {
		PNo = pNo;
	}
private String fristName;
   private String lastName;
   private String department;
   private float salary;
   private int PNo;
	
	
	
}
