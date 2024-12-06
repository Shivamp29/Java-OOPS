package com.jsp;

class Animal
{
	public void sound()
	{
		System.out.println("Animals are making sound...");
	}
}

class Dog extends Animal
{
	// overriding the sound method of animal class
	public void sound()
	{
		System.out.println("Bhow...Bhow...");
	}
}

class Cat extends Animal
{
	// overriding the sound method of animal class
	public void sound()
	{
		System.out.println("Maow..Maow..");
	}
}

public class RuntimePollyMainClass 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println("Dog sound is : ");
		d1.sound(); // calling dog class method
		
		System.out.println("-----------------------------");
		
		Cat c1 = new Cat();
		System.out.println("Cat sound is : ");
		c1.sound(); // calling cat class method
	}
}
