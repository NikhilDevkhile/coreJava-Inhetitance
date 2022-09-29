package inheritacne.hira.com;

public class CurrentAccount  extends Bank
{

	private int acno;
	private int id;
	private String name;
	public CurrentAccount()
	{
		
	}
 public CurrentAccount(int a, int d,String n)
 {
	 super();
	 acno=a;
	 id=d;
	 name=n;
 }
 public void  ShowCurrentAccount()
 {
	 System.out.println("The Account number  is="+ acno);
		System.out.println("The Account holder id    is="+id);
			
		System.out.println("The Account holder name  is="+ name);
		
 }
	
}
