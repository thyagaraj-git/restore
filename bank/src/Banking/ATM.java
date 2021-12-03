package Banking;

public class ATM implements Bank {
	
	int bal=5000;
	public void deposit(int amount) {
		System.out.println("amount to be deposited :"+amount);
		bal=bal+amount;
		System.out.println("deposite succesfull");
	}
		public void withdraw(int amount) {
		
			System.out.println("amount to be withdrawn :"+amount);
			bal=bal-amount;
			System.out.println("withdraw succesfull");
		}
			
			public void checkbalance() {
				System.out.println("balance is :"+bal);
				
			}
			
		}
	
	


