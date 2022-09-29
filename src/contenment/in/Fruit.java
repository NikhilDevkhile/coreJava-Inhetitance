package contenment.in;

public class Fruit {
	
	String fruitName;
	int fruitQuantity;
	String fruitColour;
	
	
	
	public Fruit(String fn,int fq,String fc)
	{
		fruitName=fn;
		 fruitQuantity=fq;
		 fruitColour=fc;
				
		
	}
	public String toString()
	{
		return "The Fruit name\n"+ fruitName+"is"+ "The Fruit Quantity is \n"+fruitQuantity+" the Fruit colour"+fruitColour;
	}
	
}
