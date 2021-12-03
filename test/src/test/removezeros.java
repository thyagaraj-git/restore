package test;

public class removezeros {

	public static void main(String args[])
	{
		int arr[]= {1,3,2,0,4,0,5};
		for(int i=0;i<arr.length;i++)
		if(arr[i]!=0)
			System.out.println(arr[i]);
	}
}
