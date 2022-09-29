package com.encap;

public class Showroom {

	public static void main(String[] args)
	{
		Laptop l1=new Laptop();
		l1.setOpratingName("ios");
		l1.setBrand("Apple");
		l1.setCost(192999);
		System.out.println("The laptop operator is:"+l1.getOpratorName());
			System.out.println("The laptop Brand iss:"+l1.getBrand());
			System.out.println("The Laptop Cost is:"+l1.getCost());

		
	}

}
