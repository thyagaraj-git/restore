package collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class dateAssignment {
public static void main(String args[])
{
	String str1="11-01-2000";
	String str2="24-03-1999";
	String str3="25-08-2000";
	String str4="27-09-2012";
	Date date1=null;
	try {
		date1=new SimpleDateFormat("dd-MM-yyyy").parse(str1);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date date2=null;
	try {
		date2=new SimpleDateFormat("dd-MM-yyyy").parse(str2);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date date3=null;
	try {
		date3=new SimpleDateFormat("dd-MM-yyyy").parse(str3);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date date4=null;
	try {
		date4=new SimpleDateFormat("dd-MM-yyyy").parse(str4);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	LinkedList<Date>list=new LinkedList<Date>();
	list.add(date1);
	list.add(date2);
	list.add(date3);
	list.add(date4);
	int i=list.size()-1;
	while(i>=0) {
		SimpleDateFormat f1=new SimpleDateFormat("dd-MM-yyyy");
		String str=f1.format(list.get(i));
		System.out.println("date of birth is: "+str);
		int year=list.get(i).getYear();
		
		if(year%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		i--;
	}
	
	
}
}
