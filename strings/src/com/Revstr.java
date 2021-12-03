package com;
import java.util.*;
public class Revstr {
String s="raj loves programming";
String str="";



for(int i=0;i<words.length;i++)
{
	char x[]=words[i].toCharArray();
	for(int j=x.length-1;j>=0;j--)
	{
		str=str+x[i];
		if(j!=words.length-1) {
			str=str+" ";
			
		}
		System.out.println(str);
	}
}
}
