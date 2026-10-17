package com.tca.entity;

public class FullTimeStaff extends Staff

{
  private String department;
  private double salary;
 
 public FullTimeStaff(String name,String address,String department,double salary)
 {
	 super(name,address);
	 this.department = department;
	 this.salary = salary;
	 
 }
 
 public void display()
 {
	 System.out.println("Name : " + name);
	 System.out.println("Address : " + address);
	 System.out.println("Department : " + department);
	 System.out.println("Salary : " + salary);
 } 
	
 
 
}

