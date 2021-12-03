package num;

import java.util.Scanner;

public class Astnum 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int no=sc.nextInt();
	int r=0;
	int sum=0;
	int temp=no;
	
	while(no>0)
	{
		r=no%10;
		no=no/10;
		sum=sum+ r*r*r;
	}
		
		if(temp==sum) {
			System.out.print("armstrong");
		}
			else {
		System.out.println("not armstrong");
			}	

}
}
