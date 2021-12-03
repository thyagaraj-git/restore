package num;

import java.util.Scanner;

public class Tcs {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size");
	int n=scan.nextInt();
	
	int arr[]=new int[n];
	System.out.println("enter the elements");
	
	for(int i = 0; i < n; i++)
    {
        arr[i] = scan.nextInt();
    }
   int max = arr[0];
    for(int i = 0; i < n; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
        }
    }
    System.out.println("Maximum value:"+max);
}
}

