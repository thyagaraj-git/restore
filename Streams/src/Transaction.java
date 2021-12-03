
public class Transaction {

	Trader Trader;
	int year;
	int value;
	
	Transaction(Trader Trader,int year,int value)
	{
		this.Trader=Trader;
		this.year=year;
		this.value=value;
	}

	@Override
	public String toString() {
		return "Transaction [Trader=" + Trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
