package collections;
import java.util.TreeSet;
import java.util.Scanner;

public class quest2 {
public static void main(String args[])
{
//	value v1=new value(name:"mike");
	
	
	
	int size=10;
	Scanner sc=new Scanner(System.in);
	
	TreeSet<String>tr=new TreeSet<String>();
	
//	while(size<10)
//	{
//		tr.add(sc.nextInt());
//		
//	}
//	System.out.println(tr);
	tr.add("mike");
	tr.add("john");
	tr.add("cassie");
	tr.add("john");
	tr.add("lisa");
	for (String i:tr)
	{
		System.out.println(i);
	}
}
}
//class value{
//	private String name;
//	public value(String name)
//	{
//		this.name=name;
//	}
//	public String toString()
//	{
//		return name;
//	}
//}
