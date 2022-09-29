package intritance.single.com;

public class Pratical extends Exam

{
	private int outofMarks;
	private String topic;
	Exam er;

public Pratical()
{
	
}
	 public Pratical(int o,String t)
	 {
		 super("written",65,87,65);
		 outofMarks=o;
		 topic=t;
		 
	 }
	 public  void setEr(Exam e)
	 {
		 er=e;
	 }
	
	public String toString() {
		return "Pratical [outofMarks=" + outofMarks + ", topic=" + topic + er+"]";
	}
	
	
	
	
	
	
	
	
}
