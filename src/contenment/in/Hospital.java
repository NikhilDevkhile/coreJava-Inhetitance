package contenment.in;

public class Hospital
{
	String hospitalName;
	int  floor;
	int  kebinNum;
	Doctor d1;
	
	public Hospital(String hn,int f,int kn ,Doctor d)
	{
		hospitalName=hn;
		floor=f;
		kebinNum=kn;
		d1=d;
	}
	public String toString()
	{
		return  "The hospital name:-"+hospitalName+"\nThe Floor is:-"+floor+ "\nThe kebin num:-"+kebinNum+ "\n the Doctor has"+d1;
	}
	
	

}
