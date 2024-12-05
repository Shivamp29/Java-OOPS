package com.jspiders.p1;

public class Demo1 
{
	int x=10;	
	void test()
	{
		System.out.println("Running test() method body....");
	}
}

public class demo2 extends Demo1 
{
	int y =20;
	void disp()
	{
		System.out.println("Running disp() method body....");
	}
}

public class demo3 extends demo2
{	
	int z =30;
	
	void view()
	{
		System.out.println("Running view() method body....");
	}
}

public class MultiLevelInheritance
{
	public static void main(String[] args) 
  {
		// creating reference variable of the sub class
		demo3 d1 = new demo3();
		
		//  accessing non-static member variable of the class Demo1 
		System.out.println("x value is : "+d1.x);
		
		//  accessing non-static member variable of the class demo2 
		System.out.println("y value is : "+d1.y);
		
		//  accessing non-static member variable of the class demo3 
		System.out.println("z value is : "+d1.z);
		
		// accessing member function of the class Demo1 , demo2 & demo3
		d1.test();
		d1.disp();
		d1.view();
		
	}
}
