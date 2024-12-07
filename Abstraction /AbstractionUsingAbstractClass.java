package com.jsp.Abstraction;

abstract class Animal
{
	abstract void noise();
}

class cat extends Animal
{
	String name ;
	
	public cat(String name)
	{
		this.name=name;
	}
	public void noise()
	{
		System.out.println(name+" is making a sound as...meow ,meow , meow.......");
	}
}

class dog extends Animal
{
	String name ;
	
	public dog(String name )
	{
		this.name = name;
	}
	public void noise()
	{
		System.out.println(name + " is making a sound as...Bhow , Bhow , Bhow........ ");
	}
}
public class AbstractionUsingAbstractClass 
{
  public static void main(String[] args) 
  {
    Animal a1 = new cat("Cat1");
    Animal a2 = new dog("Dog1");
    
    a1.noise();
    a2.noise();
	}
}
