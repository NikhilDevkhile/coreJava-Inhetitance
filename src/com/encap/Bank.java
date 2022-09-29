package com.encap;

public class Bank 
{

	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.setAccountNo(123457);
		a1.setAccountId(98);
		a1.setAccountName("guru");
		System.out.println("The Account Number is :"+a1.getAccountNo());
		System.out.println("The Account Id  is :"+a1.getAccountId());
		System.out.println("The Account Name is :"+a1.getAccountName());
		
		

	}

}
