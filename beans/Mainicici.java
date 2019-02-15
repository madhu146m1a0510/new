package com.icici.beans;
import java.util.Scanner;

public class Mainicici {

	public static void main(String[] args) 
	{
		Arraylist al=new Arraylist();
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("(1)Already a customer");
		System.out.println("(2)New customer");
		System.out.println("choose one option");
		int userchoice = s.nextInt();
		
		switch(userchoice)
	     {
	        case 1:
	        			break;
	        case 2:
	        	System.out.println("enter the details:");
				System.out.println("enter name:");
				String n1=s.next();
				System.out.println("enter address");
				String n2 = s.next();
				System.out.println("enter mobile_number");
				String n3 = s.next();
				System.out.println("enter email");
				String n4 = s.next();
				System.out.println("enter username:");
				String n5 = s.next();
				System.out.println("enter password");
				String n6 = s.next();
				al.account(n1,n2,n3,n4,n5,n6);
				al.print();
				break;
		
	        default:
	        	System.out.println("Select correct option: "+userchoice);

		
		

	}

}
}