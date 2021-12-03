package Banking;

public class customer {
	public static void main(String[] args)
	{
		Bank b1=new ATM();
		b1.deposit(3000);
		b1.withdraw(2000);
		b1.checkbalance();
	}

}
