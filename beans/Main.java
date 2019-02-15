package com.icici.beans;

public class Main {

	public static void main(String[] args) {
	Newaccount n=new Newaccount();
	Validation v=new Validation();
	v.numvalid("465");
	v.emailValid("madhu@chelluri.com");
	v.panvalid("67152");
	n.read_data();;
	
	System.out.println(n);
	}

}
