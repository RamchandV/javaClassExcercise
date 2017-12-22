package com.htc.assignment4;

public class bankAccount {
	static String accountNumber;
	static String accountName;
	int accountBalance;

	public bankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bankAccount(String accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bankAccount B1 = new bankAccount(accountNumber, accountName);
		B1.accountNumber="A124";
		B1.accountName="Ramc";
		System.out.println(B1.accountName+" "+B1.accountNumber+" "+B1.accountBalance);
		
	}

}
