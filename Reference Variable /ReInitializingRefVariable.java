class Demo
{
	int x = 10 ;
	int y = 20 ;
}

// main class
public class ReInitializingRefVariable 
{
	public static void main(String[] args) 
	{
		// defining and Initializing Reference variable of type Demo
		Demo ref1 = new Demo();
		
		// address before re-initialization
		System.out.println("ref1 : "+ref1);
		
		// printing values by using ref1
		System.out.println("x value is : "+ref1.x);
		System.out.println("y value is : "+ref1.y);
		
		// modifying
		ref1.x = 100;
		ref1.y = 200;
		
		// ReInitializing Reference Variable
		ref1 = new Demo();
		
		// address After re-initialization
		System.out.println("ref1 : "+ref1);
		
		// printing values by using ref1
		System.out.println("x value is : "+ref1.x);
		System.out.println("y value is : "+ref1.y);
	}
}
