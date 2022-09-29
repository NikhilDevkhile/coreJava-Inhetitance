package containment.String.ass;

public class PersonDetails

{
	public static void main (String[]arf)
	{
	
	Address a=new  Address();
	a.setCity("pune");
	a.setState("Maharashtra");
	a.setCountry("India");
	Person p =new Person();

	p.setName("Abhinav");
	p.setGender("male");
	p.setAge(22);
	p.setAddress("Vasudhare Appartment,pune ");
	p.setAddress(a);
	System.out.println(p);
	}

}
