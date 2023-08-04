package com.Encaptulation.JavaApplication;
import java.util.Scanner;

public class ShowRoom 
{
	String name;
	long mobno;
	double cost;
	double dis;
	double finalamount;
	
	 void input() 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Coustomer Name: ");
		 name= sc.nextLine();
		 
		 System.out.println("Enter Coustomer Mobile Number: ");
		 mobno= sc.nextLong();
		 
		 System.out.println("Enter cost price : ");
		 cost=sc.nextDouble();
		 
		 if(cost > 0 && cost<= 10000)
		 {
			 dis = 0.05 * cost;
			 System.out.println("Your discount is 5%: " + dis);
			 finalamount = cost - dis;
			 System.out.println("Your final amount is: " + finalamount);
		 }
		 else if (cost>10000 && cost<= 20000)
		 {
			 dis = 0.10 * cost;
			 System.out.println("Your discount is 10%: " + dis);
			 finalamount = cost - dis;
			 System.out.println("Your final amount is: " + finalamount);
		 }
		 else if (cost>20000 && cost<= 35000)
		 {
			 dis = 0.15 * cost;
			 System.out.println("Your discount is 15%: " + dis);
			 finalamount = cost - dis;
			 System.out.println("Your final amount is: " + finalamount);
		 }
		 else if (cost>35000)
		 {
			 dis = 0.20 * cost;
			 System.out.println("Your discount is 20%: " + dis);
			 finalamount = cost - dis;
			 System.out.println("Your final amount is: " + finalamount);
		 }
	 }
	

}
