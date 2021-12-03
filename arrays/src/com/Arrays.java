package com;

public class Arrays {
public static void main(String[] args) {
	

	int arr[]= {1,1,2,3,1,5,7,5,9};
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		
		for(int j=i+1;j<=arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]='\n';
			}
			if(count==0 && arr[i]!='\n') {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
}
