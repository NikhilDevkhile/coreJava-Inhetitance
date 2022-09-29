package contenment.in;

public class Doctor 
{
	int regNo;
	 String docName;
	 String specality;
	 
	 
	 public Doctor(int rn,String dn,String s)
	 {
		 regNo=rn;
		 docName=dn;
		 specality=s;
		 
	 }
	 
	 public String toString()
	 {
		 return "\nThe reg no:- "+regNo+"\nThe doctor name is:-"+docName+"\nThe Specality is:-"+specality;
	 }
	 

}
