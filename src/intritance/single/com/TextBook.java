package intritance.single.com;

public class TextBook extends Book
{
	private String subject;
	private int noOfPages;
	
	public TextBook() {}
	
	public TextBook(String s,int n)
	{
		super(32,"Raghav Publication");
		subject=s;
		noOfPages=n;
		
	}
	void readBook(String s)
	{
		super.readBook("mathmatics ");
		System.out.println("Iam reading this book"+s);
	}
	public void ShowTextBook()
	{
		
	System.out.println("The subject is =:"+subject)	;
	System.out.println("The noOfPages is  =:"+noOfPages)	;
	
	
	}
	
	

	
	
}
