public class Sample1 
{
	int x =10 ;
	int y = 20;
}
public class Demo1 
{	
	void test() 
	{	
    // creating an object ofSample1 class 
		Sample1 s1 = new  Sample1(); 
		
		// accessing members of Sample1 Class
		System.out.println("value of x : "+s1.x); 
		System.out.println("value of y : "+s1.y);
	}
}

// main class
public class LocalReferenceVariable 
{
	public static void main(String[] args) 
	{	
		Demo1 d1 = new Demo1();
		d1.test();
	}
}
