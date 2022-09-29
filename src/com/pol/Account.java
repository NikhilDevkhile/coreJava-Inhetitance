package com.pol;

public class Account 
{
private int  acno;
private String name;
private float balance ;
public static  String bankName="icici bank";
public static  float iRate=7.2f;

public Account(int a,String n,float b)
{
	acno=a;name=n;balance=b;
	
}

public  static void chengeIntrestRate(float rate)
{
	iRate= rate;
	
}

public void ShowAccountDetails()
{
	System.out.println("cust name:"+name);
	System.out.println("cust acno:"+acno);
	System.out.println("cust balance:"+balance);
	System.out.println("cust bank name:"+Account.bankName);
	System.out.println("cust i rate:"+Account.iRate);
	
	
	
}





















}
