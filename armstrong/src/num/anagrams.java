package num;

import java.util.Arrays;

public class anagrams {
	public static void main(String[] args)
	{
		String x="listen";
		String y="sillnt";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean res=Arrays.equals(a, b);
		if(res==true)
		System.out.println("anagrams");
		else
			System.out.println("not anagrams");
	}

}
