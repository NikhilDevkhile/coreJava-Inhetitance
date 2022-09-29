package com.pol;

public class Airplane 
{
	 int tickitNo;
	  float tickitPrice ;
	  String location;
	  
	public Airplane(int tN,float tP,String l )
	{
		tickitNo=tN;
		tickitPrice=tP;
		location=l;
		
		
	}
	public void ShowAirplaneDetail()  
	{
	System.out.println("The Tickit Number is:-"+tickitNo);	
	System.out.println("The Tickit Price is:-"+tickitPrice);
	System.out.println("The Tickit location is:-"+location);
		
		
	}
	 
	 
}
