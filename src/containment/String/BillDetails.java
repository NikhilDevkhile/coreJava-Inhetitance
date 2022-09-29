package containment.String;

public class BillDetails {

	public static void main(String[] args)
	{
		MyDate m=new MyDate();
		m.setMonth(11);
		m.setDate(1);
		m.setYear(2022);
		Bill b =new Bill();
		b.setBillAmount(12500.00f);
		b.setBillNo(1121);
		b.setBilldate(m);
		System.out.println(b);

	}

}
