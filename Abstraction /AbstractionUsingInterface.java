package com.jsp.Abstraction;

interface Vehical
{
	void start();
	void move();
	void stop();
	
}

class Bike implements Vehical
{
	public void start()
	{
		System.out.println("Bike starting by kick...");
	}
	public void move()
	{
		System.out.println("putting gear to move the bike...");
	}
	public void stop()
	{
		System.out.println("applying break to stop....");
	}
}

class Car implements Vehical
{
	public void start() {
		System.out.println("starting by key...");
	}
	
	public void move() {
		System.out.println("applying acceleration to move...");
	}
	
	public void stop() {
		
		System.out.println("applying break to stop..");
	}
}
public class AbstractionUsingInterface
{
	public static void main(String[] args) 
	{
		Bike b = new Bike();
	
	    b.start();
		b.move();
		b.stop();
	    
		Car c = new Car();
		
		c.start();
		c.move();
		c.stop();
	
	}
}
