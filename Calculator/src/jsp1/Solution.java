package jsp1;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Calculator c1=new functionalities();
		while(true)
		{
			System.out.println("1:addition \n 2:subtraction \n 3:multiplication \n 4:division");
			System.out.println("enter choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("enter the 2 numbers to add");
				int x1=scan.nextInt();
				int y1=scan.nextInt();
				System.out.println(c1.sum(x1,y1));
				break;
				
			case 2:
				System.out.println("enter the 2 numbers to subtract");
				int x2=scan.nextInt();
				int y2=scan.nextInt();
				System.out.println(c1.sub( x2, y2));
				break;
				
			case 3:
					System.out.println("enter the 2 numbers to multiply");
					int x3=scan.nextInt();
					int y3=scan.nextInt();
					System.out.println(c1.multiple( x3, y3));
					break;
					
			case 4:
				System.out.println("enter the 2 numbers to divide");
				int x4=scan.nextInt();
				int y4=scan.nextInt();
				System.out.println(c1.division( x4,y4));		
				
				
			}
			
			
			
		}
		
	}

}
