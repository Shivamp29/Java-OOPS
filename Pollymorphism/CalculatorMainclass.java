package com.jsp;

class calculator 
{
	// defining same methods with different parameters
	public int add(int x, int y) 
	{
		return x + y;
	}
	public int add(int x, int y , int z) 
	{
		return x + y + z;
	}
	public double add(double x, double y) 
	{
		return x + y;
	}
	public double add(double x, double y , double z) 
	{
		return x + y + z;
	}
}

public class CalculatorMainclass 
{ 
	public static void main(String[] args) 
	{
		// creating object of Calculator class
		calculator c1 = new calculator();
		
		System.out.println("sum of 2 integers : "+c1.add(10, 20));
		System.out.println("sum of 3 integers : "+c1.add(10, 20 , 30));
		System.out.println("sum of 2 doubles : "+c1.add(10.5, 20.5));
		System.out.println("sum of 3 doubles : "+c1.add(10.5, 20.5 , 30.5));		

  }
}
