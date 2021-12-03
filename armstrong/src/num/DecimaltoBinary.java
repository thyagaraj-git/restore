package num;

public class DecimaltoBinary {
public static void main(String[] args)
{
	int n=10;
	int temp=1,bin=0;
	while(n!=0)
	{
		int rem=n%2;
		bin=bin+(rem*temp);
		temp=temp*10;
		n=n/2;
	}
	System.out.println(bin);
}
}
