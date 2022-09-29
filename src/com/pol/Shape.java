package com.pol;

public class Shape
{
	int length,breadth;
	float redius;
	
	
	public void area(int l,int b)
	{
		System.out.println("Area of reactangle is:"+l*b);
	}
	
	public void area(float l,float b)
	{
		System.out.println("Area of triangle is:"+0.5*l*b);
	}
	
	public void area(int l)
	{
		System.out.println("Area of squareangle is:"+l*l);
	}
	
	public void area(double r)
	{
		System.out.println("Area of circle is:"+r*r);
	}
	
	
	public static void main(String[]args)
	{
		Shape o=new Shape()	;
		o.area(3, 6);
		o.area(5.5f, 7.3f);
		o.area(8);
		o.area(5.0);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
