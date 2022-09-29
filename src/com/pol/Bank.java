package com.pol;

public class Bank {
	
	
	public static void main(String[] args) 
	{
		Account o1=new Account(123,"mr x",12300.0f);
		Account o2=new Account(123,"mr x",19300.0f);
		o1.ShowAccountDetails();
		o2.ShowAccountDetails();
		Account.chengeIntrestRate(7.6f);
		o1.ShowAccountDetails();
		o2.ShowAccountDetails();
	}

}
