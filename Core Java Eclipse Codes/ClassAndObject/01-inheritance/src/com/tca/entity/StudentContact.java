package com.tca.entity;

public class StudentContact extends Student

{

	private String email;
	private String whatsapp;
	
	public StudentContact() 
	{
		super();
	}

	public StudentContact(int rno,String name,double per,String email, String whatsapp)
	
	{
		super(rno,name,per);
		this.email = email;
		this.whatsapp = whatsapp;
	}
	
	
	
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp)
	{
		this.whatsapp = whatsapp;
	}

	public void display()
	
	{
		super.display();
		System.out.println("Student Email : " + email);
		System.out.println("Whatsapp Number : " + whatsapp);
	}
	
	
		
	
}
