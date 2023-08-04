package com.Encaptulation.JavaApplication;

public class Test 
{
	public static void main(String[] args) 
	{
	Student s=new Student();
	/*
	 * To set the data 
	 */
	s.setname("Mota");
	s.setperc(65.65);
	s.age=32;
	/*
	 * To get the data 
	 */
	System.out.println("Student name is: " + s.getname());
	System.out.println("Student perc is: " + s.getperc());
	}
}
