package containment.String.ass;

public class Student 
{
	private int roll;
	private String name;
	Department d;
	public int getROll()
	{
		return roll;
	}
	public void setId(int r) 
	{
	   roll=r;
		
	}

	public String getName()
	{
		return name;
		
	}
	public void setName(String n)
	{
		name=n;
	}
	public void set (Department d1)
	{
		d=d1;
	}
	public String toString()
	{
		return "\nThe Roll no is:"+roll+"\nThe student Name is:"+name+"\nhas "+d;
	}

}
