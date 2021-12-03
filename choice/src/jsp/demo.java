package jsp;

import java.util.Scanner;
public class demo {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("enter choice");
		System.out.println("--------------------");
		int choices=sc.nextInt();
		
		switch(choices)
		{
		case 1:System.out.println("hi dinga");
		break;
		case 2:System.out.println("hi guldu");
		break;
		case 3: System.exit(0);
		default:System.out.println("invalid choice ");
		}
	}
}
}
