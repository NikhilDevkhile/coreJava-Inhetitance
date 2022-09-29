package containment.String;

public class Bill 
{
	private int billNo;
	private  float billAmount;
	MyDate billDate;
	
	public int getBillNo()
	{
		return billNo;
		
	}
	
	public void setBillNo(int bn)
	{
		billNo=bn;
	}
	
	
	public float getBillAmount()
	{
		return billAmount;
		
	}
	
	public void setBillAmount(float ba)
	{
		billAmount=ba;
	}
	 public void setBilldate(MyDate d)
	 {
		 billDate=d;
	 }
	public String toString()
	{
		return "The billNo"+billNo+"The bill Amount is "+billAmount+"The date has "+billDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
