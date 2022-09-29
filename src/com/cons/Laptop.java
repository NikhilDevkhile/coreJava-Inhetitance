package com.cons;

public class Laptop
{
private String brand;
private String opreatorName;
private int cost;

public  Laptop()
{
	
	brand="Apple";
	opreatorName= "ios";
	cost=70000;
	
	
}
public Laptop(String b,String oN,int c)
{

	this( b,oN);
	
	brand=b;
	opreatorName=oN;
	cost=c;
	
	
}

Laptop(String brand,String opreatorName)
{

this.cost=cost;

}
  public void ShowLaptopDetails()
{
	  
	System.out.println("The Laptop brand is:"+this.brand);
	System.out.println("The Laptop opreatorName is:"+this.opreatorName);
	System.out.println("The Laptop cost  is:"+this.cost);
}
























}
