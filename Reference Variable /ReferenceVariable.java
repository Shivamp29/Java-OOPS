class Demo
{
	int x = 10 ;
	int y = 20 ;
}

// main class
public class ReferenceVariable 
{
	public static void main(String[] args) 
	{
		// defining Reference variable of type Demo
		Demo ref1;
		
		// Initializing reference variable
		ref1 = new Demo();
		 
		// Accessing members of the Demo class using Reference variable
		System.out.println("x value is : "+ref1.x);
		System.out.println("y value is : "+ref1.y);
		
	}
}
