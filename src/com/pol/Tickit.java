package com.pol;

public class Tickit
{
public void AccessInformation(Bus b)
{
	System.out.println("The bus details");
	b.ShowBusDetail();
}
public void AccessInformation(Train t1)
{
	System.out.println("The Train details");
	t1.ShowTrainDetail();
}
public void AccessInformation(Airplane a)
{
	System.out.println("The Airplane details");
	a.ShowAirplaneDetail();
}
	public static void main(String[] args)
	{
		Tickit o=new Tickit();
		Bus b=new Bus(22,3000.00f,"manali");
		o.AccessInformation(b);
		Train t1 = new Train(23,2000.00f,"manali");
		o.AccessInformation(t1);
		Airplane a=new Airplane(24,5000.00f,"manali");
		o.AccessInformation(a);
	}     


}


