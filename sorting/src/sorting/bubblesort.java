package sorting;

public class bubblesort {
	
		public static void main(String[] args)
		{
			int arr[]= {32,12,9,45,22};
			int temp;
			for (int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]>arr[j+1])   //to sort string array
						                    // for(arr[j].compareTo arr[j+1]>0)//
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
						
			    }
			}
			for (int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
}



