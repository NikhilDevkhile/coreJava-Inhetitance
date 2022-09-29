package com.star1;



public class Account{

	static long cnt=123456;
	 long  acno;
	 static int ct=0;
	private String name;
	private float balance ;
	public static  String bankName="icici bank";
	public static  float iRate=7.2f;
	
		public class  Object{
			
		}

	public Account()
	{
		
		acno=cnt++;
	}

	public Account(String n,float b)
	
	{

		acno=cnt++;name=n;balance=b;
		
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

