package com.cg.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class BankAccountSet {

	TreeSet<SavingsAccount> s = new TreeSet<SavingsAccount>();

	public void addAccountDetails(SavingsAccount account) {
		s.add(account);
	}

	public TreeSet<SavingsAccount> getAllDetails() {
		return s;
	}
}