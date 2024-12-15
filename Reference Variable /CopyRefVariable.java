class Demo
{
	int x = 10 ;
	int y = 20 ;
}

// main class
public class CopyRefVariable 
{
	public static void main(String[] args) 
	{
		// defining and Initializing Reference variable of type Demo
		Demo ref1 = new Demo();
		
		// copying ref1 to ref2
		Demo ref2 = ref1 ; 
		
		// both ref1 and ref2 have the same address
		System.out.println("ref1 : "+ref1);
		System.out.println("ref2 : "+ref2);
		
		// printing values by using ref1
		System.out.println("x value is : "+ref1.x);
		System.out.println("y value is : "+ref1.y);
		
		// printing values by using ref2
		System.out.println("x value is : "+ref2.x);
		System.out.println("y value is : "+ref2.y);
		
		
	}
}
