package inheritacne.hira.com;

public class FdAccount extends Bank
{
	private int acno;
	private String name;
	private long mobilenum;
	
	public FdAccount(int a,String n,long m)
	{
	super()	;
	acno=a;
	name=n;
	mobilenum=m;
	}
	
	
public void ShowFdAccount()	
{
	System.out.println("The Account number  is="+ acno);
	System.out.println("The Account holder name    is="+name);
		
	System.out.println("The mobile  number  is="+ mobilenum);
	
	
}
	
	
	
	
	
	

}
