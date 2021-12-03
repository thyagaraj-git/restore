package jsp1;

public class functionalities implements Calculator {
	int res;
	public int sum(int x,int y)
	{
	
		System.out.println("the sum of 2 num is");
		res=x+y;
		return res;	
	}
	public int sub(int x,int y)
	{
		System.out.println("the sum of 2 num is");
		res=x-y;
		return res;
	}
	public int multiple(int x,int y)
	{
		System.out.println("the product of 2 num is");
		res=x*y;
		return res;
	}
	public int division(int x,int y)
	{
		System.out.println("the product of 2 num is");
		res=x/y;
		return res;
	}

}
