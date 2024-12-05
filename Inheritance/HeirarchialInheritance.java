package com.jspiders.p1;

public class Person 
{
	// general properties / common properties of person 
	String name ;
	int age;
	String gender;
}

public class Student  extends Person 
{
	int studid;
	String sub ;
	int marks;
	
	void stud_details ()
	{
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		System.out.println("student id : "+studid);
		System.out.println("subject is  : "+ sub );
		System.out.println("Marks : "+marks);
	}
}

public class Employee extends Person 
{
	int empid;
	String dsgn ;
	double sal;
  
	void emp_details()
	{
		System.out.println("empid : "+empid);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		System.out.println("dsgn : "+dsgn);
		System.out.println("salary is : "+sal);
	}
}

// Main class
public class HeirarchialInheritance 
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
			
			s1.name="Shivam";
			s1.age = 22;
			s1.gender = "Male";
			s1.sub ="JAVA";
			s1.studid= 10;
			s1.marks = 80;
			
			s1.stud_details();
			
			System.out.println("========================");

		Employee e1 = new Employee();
		
			e1.name ="Kiran";
			e1.age = 24;
			e1.gender = "Male";
			e1.empid = 11 ;
			e1.dsgn = "Software Engn.";
			e1.sal = 25000.00;
			
			e1.emp_details();
	}		
}



