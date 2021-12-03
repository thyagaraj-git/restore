package num;
import java.lang.*;
import java.util.*;
public class Max {
static final int maxchar=26;

public static int minchanges(String str)
{
	int n=str.length();
	int dcount=0;
	int count[]=new int[maxchar];
	for(int i=0;i<maxchar;i++)
		count[i]=0;
	for(int i=0;i<n;i++) {
		if(count[str.charAt(i)-'a']==0)
			dcount++;
	count[str.charAt(i)-'a']++;
	}	
	return(n-dcount);
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println(minchanges(str));
}

}
