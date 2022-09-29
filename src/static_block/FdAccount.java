package static_block;

public class FdAccount {

	
	public static  String bankName;
	public static  float iRate;
	
	
	
	static
	{
		iRate=7.2f;
		System.out.println("intrestRate"+iRate);
	}
	
	static 
	{
		bankName="icici bank";
		System.out.println("The bank name is::"+bankName);
	}
	
public void Show()
{
	System.out.println("The intrestRate  is:"+iRate);
	System.out.println("The bank name is:"+bankName);
}
	
	

}
