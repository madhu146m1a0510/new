package com.cg.collections;

public class AccountdetailsMain {

	public static void main(String[] args) {
		
SavingsAccount acc=new SavingsAccount(12000,237,"madhu",false);
SavingsAccount acc1=new SavingsAccount(10000,30,"siddhu",true);

SavingsAccount acc2=new SavingsAccount(1000,230,"lasya",true);

SavingsAccount acc3=new SavingsAccount(16000,37,"teja",true);
acc.deposit(10000);
BankAccountSet ba=new BankAccountSet();
ba.addAccountDetails(acc);
ba.addAccountDetails(acc1);
ba.addAccountDetails(acc2);
ba.addAccountDetails(acc3);
for(SavingsAccount sa:ba.getAllDetails())
{
	System.out.println(sa);
}
	}

}
