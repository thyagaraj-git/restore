package Banking;

import java.util.Scanner;
public class solution {
	
	public static void main(String[] args)
	{
		System.out.println("welcome to atm");
		System.out.println("---------");
		Scanner scan=new Scanner(System.in);
		Bank b=new ATM();
		
		while(true) {
			System.out.println("1:deposit \n 2:withdraw \n 3:checkbalance \n 4:exit");
			System.out.println("enter choice");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter the amount to be deposited");
				int amttobedep=scan.nextInt();
				b.deposit(amttobedep);
				break;
				
			case 2:
			System.out.println("enter the amount to be withdrawn");
			int amttobewith=scan.nextInt();
			b.withdraw(amttobewith);
			break;
			
			case 3: b.checkbalance();
			break;
			 
			case 4:
			System.out.println("thank you");
			System.exit(0);
			
			default:
				System.out.println("invalid choice");
				
			}
		}
	}
}
