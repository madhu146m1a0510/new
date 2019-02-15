package com.icici.beans;

import java.util.ArrayList;

public class Arraylist 
{
	ArrayList<Person> ap;
	public Arraylist()
	{
		this.ap=new ArrayList<>();
	}
	public void account(String name,String address,String mobileNumber,String emailId,String userName,String password)
	{
		Person acc=new Person(name,address,mobileNumber,emailId,userName,password);
		this.ap.add(acc);
	}
	public void print()
	{
		for(Person p:this.ap)
		{
			System.out.println("name:"+p.getName()+"address:"+p.getAddress()+"mobile number:"+p.getMobileNumber()+"emailId:"+p.getEmailId()+"user name"+p.getUserName()+"password:"+p.getPassword());
		}
	}
}
