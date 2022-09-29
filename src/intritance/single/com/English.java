package intritance.single.com;

public class English extends TextBook 
{
	private String auther;
	private int cost;
	
	public English()
	{
		
	}
	
	public English(String a,int c)
	{
		auther=a;
		cost=c;
	}
	
	public void ShowEnglishDetails()
	{
	
		System.out.println("The Auther  is =:"+auther)	;
		System.out.println("The  cost is  =:"+cost)	;
		
	}
	

}
