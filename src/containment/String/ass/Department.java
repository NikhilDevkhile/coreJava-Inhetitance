package containment.String.ass;

public class Department 
{
	private int id;
	private String name;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int i) 
	{
		id=i;
		
	}
	public String getName()
	{
		return name;
		
	}
	public void setName(String n)
	{
		name=n;
	}
	
	
	
	public String toString ()
	{
		return "\nThe Department  id is:"+id+"\nThe Department Name is:"+name;
	}
	

}
