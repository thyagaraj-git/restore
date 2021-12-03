package num;

public class Palindrome {
	public static void main(String[] args) {
	int n=12321;
	int m=n;
	int rev=0;
	while(n!=0)
	{
		int rem=n%10;
		rev=rem+(rev*10);
		n=n/10;
		
	}
	System.out.println((m==rev)?"palindrome":"not palindrome");

}
}
