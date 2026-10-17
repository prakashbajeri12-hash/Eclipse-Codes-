package com.tca.entity;

public class Student extends Person
{
  private int rno;
  private String course;
  
  public Student()
  {
	
  }

  public Student(String name,int age ,int rno, String course) 
  {
	super(name,age);
	this.rno = rno;
	this.course = course;
  }
  
  public void display()
  {
	  
	 super.display();
	 System.out.println("Student Roll Number : " + rno);
	 System.out.println("course              : " + course);
  }
  
  
  
}


