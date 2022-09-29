package contenment.in;

public class Building
{
	String buildingName;
	int noOfFloors;
	Flat f1;
	
	 public Building(String bn,int nf,Flat f)
	 {
		 buildingName=bn;
		 noOfFloors=nf;
		 f1=f;
	 }
	
	public String toString()
	{
		return  "The "+buildingName+"\nThe floor number :-"+noOfFloors+"\n  has Flat"+f1;
	


	 }

}