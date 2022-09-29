package containment.String;

public class MyDate 
{
	private int month;
	private int year;
	private int date;
	
	public  int getMonth()
	{
		return month;
	}
	public  void setMonth(int m)
	{
		month =m;
	}

	
	public  int getYear()
	{
		return year;
	}
	public  void setYear(int y)
	{
		year =y;
	}

	public  int getDate()
	{
		return date;
	}
	public  void setDate(int d)
	{
		date =d;
	}
	 public String toString()
	 {
		 return""+ month+year+date;
	 }
	
	
}
