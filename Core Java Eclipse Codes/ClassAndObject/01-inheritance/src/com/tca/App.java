package com.tca;

import com.tca.entity.StudentContact;

public class App
{

	public static void main(String[] args)
	{
		StudentContact s1 = new StudentContact();
		s1.display();
		
		System.out.println("--------------------------------");
		
		StudentContact s2 = new StudentContact(101,"Prakash",75.8,"prakashbajeri@gmail.com","7350407725");
		s2.display();
		
		System.out.println("----------------------------------");
		
		StudentContact s3 = new StudentContact();
		s3.setRno(102);
		s3.setName("Omkar");
		s3.setPer(80.0);
		s3.setEmail("omkarrajak@gmail.com");
		s3.setWhatsapp("9890334838");
		
		//s3.display();
		
		
		System.out.println("Student Roll Number : " + s3.getRno());
		System.out.println("Student name        : " + s3.getName());
		System.out.println("Student Percentage  : " + s3.getPer());
		System.out.println("Student Email : " + s3.getEmail());
		System.out.println("Whatsapp Number : " + s3.getWhatsapp());
				

	}

}
