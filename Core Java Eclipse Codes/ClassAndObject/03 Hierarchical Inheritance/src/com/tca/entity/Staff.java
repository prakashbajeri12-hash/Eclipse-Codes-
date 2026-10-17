package com.tca.entity;

abstract class Staff 
{
	public String name;
	public String address;
	
	public  Staff(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	
	abstract public void display();
	

}
