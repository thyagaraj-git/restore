package collections;
import java.util.*;

public class sortEmployee {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("select any option");
	System.out.println("1.ID \n 2.Name \n 3.Department \n 4.Salary");
	int select =sc.nextInt();
	TreeSet<Employee>e1=null;
	switch(select)
	{
	case 1: e1=new TreeSet<>(new idcompare());
	break;
	case 2: e1=new TreeSet<>(new namecompare());
	break;
	case 3: e1=new TreeSet<>(new depcompare());
	break;
	case 4: e1=new TreeSet<>(new salarycompare());
	break;
	}
	e1.add(new Employee(11,"raju","EC",20000));
	e1.add(new Employee(22,"manu","EE",25000));
	e1.add(new Employee(33,"ram","cs",15000));
	e1.add(new Employee(44,"sheik","me",21000));
	e1.add(new Employee(55,"sid","EC",22000));
	e1.add(new Employee(22,"mohan","IT",26000));
	e1.add(new Employee(33,"ravi","civil",19000));
	e1.add(new Employee(11,"shiva","IT",18000));
	
	for (Employee e:e1)
	{
		System.out.println(e);
	}
	
	
//	Employee e1=new Employee(111,"employee1","EC",20000.0);
//	Employee e2=new Employee(222,"employee2","cs",25000.0);
//	Employee e3=new Employee(333,"employee3","IT",30000.0);
//	Employee e4=new Employee(444,"employee4","ME",35000.0);
// 
//	
	
	
}
}
class idcompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class namecompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	}

class depcompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	}
class salarycompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	}
