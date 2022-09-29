package intritance.single.com;

public class Account 
{
private int  acno;
private String name;


public void  AcceptDetails(int a,String n)
{
	acno=a;
	name=n;
	
}

public void ShowAccountDetails()
{
	System.out.println(" The account number is:"+acno);
	System.out.println(" The  name is:"+name);
}








}
