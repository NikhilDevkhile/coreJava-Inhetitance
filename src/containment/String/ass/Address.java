package containment.String.ass;

public class Address 
{
	private String  city;
	private String  state;
	private String  country;
	
	
	
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String c) 
	{
		city=c;
		
	}
	public String getState()
	{
		return state;
	}
	public void setState(String s) 
	{
		state=s;
		
	}
	
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String co) 
	{
		country=co;
		
	}
	
	
	
	public String toString()
	{
		return "\nThe city is:"+city+"\nThe State is:"+state+"\nThe country is"+country;
	}
	
	
	
	

}
