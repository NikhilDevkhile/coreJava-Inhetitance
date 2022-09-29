//Multi Inheritance example 

package intritance.single.com;

public class Book 
{
	private int bookid;
	private String publication;
	
	public Book() {}
	
	public Book(int bi,String p)
	{
		bookid=bi;
		publication=p;

	}
	void readBook (String s)
	{
		System.out.println("I am reading   this book"+s);
	}
	
	public  void ShowBookDetails ()
	{
		
		System.out.println("The book id is="+bookid);
		System.out.println("The book Publication  is="+publication);
		
	}
	

}
