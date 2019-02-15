package com.icici.beans;

	public class Person {
		//Scanner sc = new Scanner(System.in);
		private String name;
		private String address;
		private String mobileNumber;
		private String emailId;
		private String userName;
		private String password;
		
		public Person(String name, String address, String mobileNumber, String emailId, String userName,
				String password) {
			this.name = name;
			this.address = address;
			this.mobileNumber = mobileNumber;
			this.emailId = emailId;
			this.userName = userName;
			this.password = password;
		}
		//private ArrayList<Account> accounts;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
	

		
		

	