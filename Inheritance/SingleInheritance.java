package com.jsp;

//Parent class or super class
class Pen 
{
	String brand = "Cello";
	String color = "Blue";
	double price = 7.0 ;
}

// child class or derived class
class MarkerPen extends Pen
{
	public void write()
	{
		System.out.println("Writing by using markerPen..");
	}
}

// Main class
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		
		MarkerPen m = new MarkerPen();
		
		System.out.println("Brand is : "+m.brand);
		System.out.println("Color is : "+m.color);
		System.out.println("Price is : "+m.price);
		
		m.write();
	}
}
