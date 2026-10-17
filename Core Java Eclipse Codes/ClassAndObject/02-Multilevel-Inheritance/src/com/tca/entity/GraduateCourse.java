package com.tca.entity;

public class GraduateCourse extends Student
{
	private String specialization;

	public GraduateCourse(String name,int age,int rno,String course ,String specialization)
	{
		super(name,age,rno,course);
				
		this.specialization = specialization;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Specialization : " + specialization);
	}
	
	
	
	
	
	
	

}
