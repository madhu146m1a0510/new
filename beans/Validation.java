package com.icici.beans;

	import java.util.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Validation 
	{
		public static boolean numvalid(String s)
		{
			Pattern p= Pattern.compile("[6-9][0-9]{9}");
			return false;
			
		}
		public static boolean emailValid(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z]+\\.)+[a-z" + 
	                            "A-Z]{2,3}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false;
			return false; 
	      
	    } 
		public static boolean panvalid(String pan)
		{
			Pattern pat = Pattern.compile("[A-Z0-9]{10}");
			return false;
			
		}
	}

