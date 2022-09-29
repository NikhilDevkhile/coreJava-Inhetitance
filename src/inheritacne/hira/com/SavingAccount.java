package inheritacne.hira.com;

public class SavingAccount extends Bank

{
	private int acno;
	private String name;
	
	public SavingAccount() {}
	
	public SavingAccount(int a,String n)
	{
		super();
		acno=a;
		name=n;
	}
	
	public void ShowSavingAccount()
	{
		System.out.println("The Account number  is="+ acno);
		System.out.println("The Account holder name    is="+name);
		

	}
	
	
	
	
	

}
