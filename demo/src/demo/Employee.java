package demo;

public class Employee {
	
	void work()
		{
			System.out.println("working");
		}
	}

 class Developer extends Employee{
	void work()
	{
		System.out.println("developing app");
	}
}
 class tester extends Employee{
	 void work()
	 {
		 System.out.println("testing app");
	 }
 }
 class main{
	public static void main(String args[]) {
		Employee e1=new Developer();
		e1.work();
		
	}
}