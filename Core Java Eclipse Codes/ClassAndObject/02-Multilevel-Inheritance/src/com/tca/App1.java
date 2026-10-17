package com.tca;

import com.tca.entity.GraduateCourse;

public class App1 
{

	public static void main(String[] args) 
	{
	
		GraduateCourse g1 = new GraduateCourse("Rahul",21,101,"Bsc Cs","Java");
		g1.display();
		
		System.out.println("--------------------------------------------------");
		
		GraduateCourse g2 = new GraduateCourse("Prakash",22,102,"BCA","Python");
		g2.display();
		
		
		 

	}

}
