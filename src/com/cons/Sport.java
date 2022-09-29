package com.cons;

public class Sport {

	public static void main(String[] args)
	{
		System.out.println("Default constructor value is");
	Team t=new Team();
	t.ShowTeamDetails();
	System.out.println("Parameterised constructor value is");
	 Team t1=new Team(21,"mumbai Challange","sumedh");
	t1.ShowTeamDetails();
	Team t2 =new Team(32,"punjab warrer","rahul");
	t2.ShowTeamDetails();

	}

}
