package intritance.single.com;

public class Exam 
{
	String examtype;
	int   maths,phy,chem;
	
	
public Exam()
{

}
public Exam(String e,int m,int p,int c)
{
	super();
	examtype=e;
	maths=m;
	phy=p;
	chem=c;
 
}

public String toString() {
	return "Exam [examtype=" + examtype + ", maths=" + maths + ", phy=" + phy + ", chem=" + chem + "]";
}

	

}
