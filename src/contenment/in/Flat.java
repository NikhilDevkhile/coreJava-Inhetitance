package contenment.in;

public class Flat
{
int  flatNo;
String ownerName;
String area;

public Flat(int fn, String on,String a)
{
	flatNo=fn;
	ownerName=on;
	area=a;
	
}

public String toString()
{
	return"\nThe flat no is "+ flatNo+"\nThe owner   Name is:-"+ownerName+"\nThe area:-"+area;

}

}