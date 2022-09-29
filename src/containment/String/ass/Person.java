package containment.String.ass;

public class Person
{
	private String name;
	private String gender ;
	private int age;
	private String address;
	Address ad1;
	

	public String getName()
	{
		return name;
	}
	public void setName(String n) 
	{
		name=n;
		
	}
	
	
	public String getGender()
	{
		return gender;
	}
	public void setGender(String g) 
	{
		gender=g;
		
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int a) 
	{
		age=a;
		
	}
	public String getAddress()
	{
		return address;
		
	}
	public void setAddress(String ad)
	{
		address=ad;
	}
	
	public void setAddress(Address d)
	{
		ad1=d;
	}
	
	
	public String toString()
	{
		return "The name is:"+name+"\nThe gender is:"+gender+"\nThe age is:"+age+"\nThe Address is:"+address+"\nhas"+ad1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
