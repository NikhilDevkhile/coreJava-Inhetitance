package inheritacne.hira.com;

public class ShowAllAccountInfo {

	public static void main(String[] args)
	{
		SavingAccount s= new SavingAccount(1121,"Akash");
		s.showBankDetails();
		s.ShowSavingAccount();
		FdAccount f=new FdAccount(3344,"Suresh",987654323);
		f.showBankDetails();
		f.ShowFdAccount();
		CurrentAccount c=new CurrentAccount(5544,32,"Karan");
		c.showBankDetails();
		c.ShowCurrentAccount();

	}

}
