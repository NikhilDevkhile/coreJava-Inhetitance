package com.cons;

public class Bank {
	
public void accessAccount(FDAccount f)
{
	System.out.println("This is FD account:");
	f.ShowAccStatus();
}
public void accessAccount(SavingAccount s)
{
	System.out.println("This is Saving account:");
	s.ShowAccStatus();
	
}
	public void accessAccount(RecuirringAccount r)
	{
		System.out.println("This is RecuirringAccount account:");
		r.ShowAccStatus();
}
	public static void main(String[] args)
	{
		Bank d= new Bank();
		FDAccount f =new FDAccount(1,5400.00f,"karan");
		d.accessAccount(f);
		
		SavingAccount s=new SavingAccount (2,6500.00f,"Suraj");
		d.accessAccount(s);	
		
		RecuirringAccount r =new RecuirringAccount (3,6400.00f,"karan");
		d.accessAccount(r);
	
	
	
	}

}
