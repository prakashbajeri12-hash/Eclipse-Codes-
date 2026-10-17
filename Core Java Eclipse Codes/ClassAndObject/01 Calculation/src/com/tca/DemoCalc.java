package com.tca;

import com.tca.math.Calc;

public class DemoCalc
{

	public static void main(String[] args) 
	{
		Calc ob = new Calc();
		int ans = ob.add(5,7);
		System.out.println("Addition : " + ans);

	}

}
