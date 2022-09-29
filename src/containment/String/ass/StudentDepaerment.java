package containment.String.ass;

public class StudentDepaerment {

	public static void main(String[] args) 
	{
		Department d= new Department();
		d.setId(123);
		d.setName("it department");
		Student s =new Student();
		s.setId(22);
		s.setName("Sourabh dhotre");
		s.set(d);
		System.out.println(s);

	}

}
