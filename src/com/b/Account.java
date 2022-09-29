package com.b;

public class Account
{

	private int AccountNo,AccountId;
	private String AcHolderN;
	
	
	
	
	public Account()
	{
		AccountNo=1234;
		AccountId=22;
		AcHolderN="madhav";
	}
	public Account(int aNo, int AId,String acN )
	{
		this.AccountNo=aNo;
		this.AccountId=AId;
		this.AcHolderN=acN;
	}
	
    public  void ShowAccountDetails()
	{
		System.out.println("Account Number:"+AccountNo);
    	
		System.out.println("Account Id:"+ AccountId);
		System.out.println("Account Holder Name:"+AcHolderN);
    	
	
	}
		
	
}
