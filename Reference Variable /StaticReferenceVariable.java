public class Demo1 
{
	int x = 20 ;
	void disp()
  {
		System.out.println(" runnuing disp method of demo1..!!");
	}
}
public class Sample1 
{
	// static reference variable 
	static Demo1 d1 = new Demo1();
	
	void test()
	{
		System.out.println(" running test method of Sample1...!!");
	}
}

// mainclass
public class StaticReferenceVariable 
{
	public static void main(String[] args)
	{	
		System.out.println(" s1 : "+Sample1.d1);
		System.out.println("value of x is : "+Sample1.d1.x);
		Sample1.d1.disp();
	}
}
