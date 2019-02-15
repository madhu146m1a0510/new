package com.cg.collections;

import java.util.Comparator;

public class SavingsAccount implements Comparable<SavingsAccount> {
	double acc_balance;
	int acc_id;
	String account_holdername;
	boolean isSalaryAccount;

	public SavingsAccount(double acc_balance, int acc_id, String account_holdername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.account_holdername = account_holdername;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getAccount_holdername() {
		return account_holdername;
	}

	public void setAccount_holdername(String account_holdername) {
		this.account_holdername = account_holdername;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(int amount) {
		return acc_balance = (acc_balance - amount);
	}

	public double deposit(int amount) {
		return acc_balance = (acc_balance + amount);
	}

	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", account_holdername="
				+ account_holdername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	

	@Override
	public int compareTo(SavingsAccount s) {
		// TODO Auto-generated method stub
		return (int) this.getAcc_id()-s.getAcc_id();
	}

}
