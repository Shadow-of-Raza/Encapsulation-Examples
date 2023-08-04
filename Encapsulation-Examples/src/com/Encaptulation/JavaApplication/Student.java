package com.Encaptulation.JavaApplication;

public class Student 
{
	
	private String name;
	private double perc;
	int age;
	
	// Setter method is used to set the value in the data members.[Settrr, writeonly, initialized]
	public void setname(String nm) 
	{
		this.name=nm;
	}
	public void setperc(double p)
	{
		if (p>35 && p<= 100)
		{
			this.perc=p;
		}
		else
		{
			System.out.println("Not Eligible... sorry ");
		}
	}
	
	//geeter method is used to get, read and fetch the data.
	
	public String getname()
	{
		return this.name;
	}
	public double getperc()
	{
		return this.perc;
	}
	
	
}
