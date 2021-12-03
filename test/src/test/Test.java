package test;
import java.util.*;
public class Test {
public static void main(String args[]) {
	int i,j;
	Scanner sc=new Scanner(System.in);
	int num =sc.nextInt();
	if(num%2==0)
	{
		System.out.println("please enter the odd num");
	}
		for(i=0;i<=num;i++)
		{
			for(j=0;j<=num;j++);
			if(i==j||i+j==num-1||i==num-1||j==num-1||i==0)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
			
		
		}
		System.out.println();
	
	}
}

