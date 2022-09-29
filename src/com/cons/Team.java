package com.cons;

public class Team
{

	private int tSize;
	private String tName,tCoatch;
	
	public Team() {
		tSize=11;
		tName="puneri paltan";
		tCoatch="Raghav";
	}
	public Team( int ts,String tn,String tc)
	{
		this();
		tSize=ts;
		tName=tn;
		tCoatch=tc;
		
	}
   public Team(int ts,String tn)
   {
	   this();
   }
	
	public void ShowTeamDetails()
	{
		System.out.println( "The team size is  :"+this.tSize);
		System.out.println( "The team Name  is  :"+this.tName);
		System.out.println( "The team coach is  :"+this.tCoatch);
		
	}

	
	
	
}
