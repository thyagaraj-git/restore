package com;

public class swap {

	public static void main(String args[]) {
		int arr[]= {1,3,2,5};
		int temp=arr[1];
		int num=arr[3];
		arr[1]=arr[3];
		arr[3]=temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
