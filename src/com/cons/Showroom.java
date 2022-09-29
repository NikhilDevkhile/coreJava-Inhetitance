package com.cons;

public class Showroom {

	public static void main(String[] args) {
		Laptop a=new Laptop();
		a.ShowLaptopDetails();
		Laptop a1= new Laptop("hp","Windos",56000);
		a1.ShowLaptopDetails();
		
		Laptop a2=new Laptop("google","andriod",32000);
		a2.ShowLaptopDetails();
	}

}
