package com.tca;

import com.tca.entity.FullTimeStaff;
import com.tca.entity.PartTimeStaff;

public class App 
{

	public static void main(String[] args) 
	{
		
		FullTimeStaff fts = new FullTimeStaff("Prakash","Pune","CS",10000.0);
		fts.display();
		
		System.out.println("----------------------------------------------------");
		
		PartTimeStaff pts = new PartTimeStaff("Omkar","Mumbai",3,100.0);
		pts.display();
		
		

	}

}
