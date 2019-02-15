package com.icici.beans;

import java.util.ArrayList;
import java.util.Scanner;

public class Newaccount {
	Scanner sc = new Scanner(System.in);
	String name;
	String email;
	long pan_number;
	String address;
	int aadhar_number;
	int mobile_number;
	String password;
	  String i =sc.nextLine();
	  String j =sc.nextLine();
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPan_number() {
		return pan_number;
	}

	public void setPan_number(long pan_number) {
		this.pan_number = (int) pan_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_number = aadhar_number;
	}

	public long getMobile_num() {
		return mobile_number;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_number = mobile_number;
	}
	


	public void read_data() {
		
		
		System.out.println("enter name");
		String name = sc.nextLine();


		System.out.println("enter password");
		String password = sc.nextLine();


		System.out.println("enter email");
		String email = sc.nextLine();

		System.out.println("enter pan_number");
		int pan_number = sc.nextInt();

		System.out.println("enter address");
		String address = sc.next();

		System.out.println("enter aadhar_number");
		int aadhar_number = sc.nextInt();

		System.out.println("enter mobile_number");
		int mobile_number = sc.nextInt();
		
		
		System.out.println("name=" + name + ",password=" + password + ", email=" + email + ", pan_number="
				+ pan_number + ", address=" + address + " ,aadhar_num=" + aadhar_number + ", mobile_number=" + mobile_number  );

	}
}
