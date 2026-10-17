package com.tca;

import com.tca.entity.Student;

public class DemoStudent 
{

	public static void main(String[] args)
	{
		Student ob1 = new Student();
		ob1.display();
		
		System.out.println("-----------------------------");
		
		Student ob2 = new Student(101,"Prakash",75.57);
		ob2.display();
		
		System.out.println("-----------------------------");
		
		Student ob3 = new Student();
		ob3.setRno(102);
		ob3.setName("Sachin");
		ob3.setPer(80.0);
		
		System.out.println("Roll Number : " + ob3.getRno());
		System.out.println("Name        : " + ob3.getName());
		System.out.println("Percentage  : " + ob3.getPer());
		
		
		
		//ob3.display();
		
		

	}

}
