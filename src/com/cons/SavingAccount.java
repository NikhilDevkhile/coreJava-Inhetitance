package com.cons;

public class SavingAccount 
{
	private int accountNumber;
	private float balance;
	private String accHolderName;
	
	public  SavingAccount(int a,float b,String an)
	{
		accountNumber=a;
		balance=b;
		accHolderName=an;
		
	}

	public void ShowAccStatus()
	{
		System.out.println("The account Holder number  is:"+ this.accountNumber);
		System.out.println("The account Holder balance  is:"+ this.balance);
		System.out.println("The account Holder  is :"+ this.accHolderName);
	}
	
}
