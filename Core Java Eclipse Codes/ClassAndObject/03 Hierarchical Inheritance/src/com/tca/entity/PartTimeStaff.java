package com.tca.entity;

public class PartTimeStaff extends Staff
{
  private int no_of_hours;
  private double rate_per_hours;
  
  public PartTimeStaff(String name,String address,int no_of_hours,double rate_per_hours)
  {
	  super(name,address);
	  this.no_of_hours = no_of_hours;
	  this.rate_per_hours = rate_per_hours;

  }
	
  public void display()
  {
	  System.out.println("Name : " + name);
	  System.out.println("Address : " + address);
	  System.out.println("Number of hours : " + no_of_hours);
	  System.out.println("Rate per hours : " + rate_per_hours);
	  System.out.println("Total Amount " + (no_of_hours * rate_per_hours ));	  
			  
  }
}

