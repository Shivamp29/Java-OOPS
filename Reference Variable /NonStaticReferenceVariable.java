public class Sample
{
	int x =20 ;
	void disp() 
  {
		System.out.println("running the disp() method of Sample1 ....!!");
	}
}
public class Demo1 
{
	// non-Static reference variableNN
	Sample1 s1 = new Sample1();
	void test() 
	{
		System.out.println("running the test method of Demo1");
	}
}

// main class
public class NonStaticReferenceVariable 
{
	public static void main(String[] args) 
	{		
		Demo1 d1 = new Demo1();
		System.out.println(" s1 : "+d1.s1);
		System.out.println("value of x is : "+d1.s1.x);
		d1.s1.disp();
	}
}
