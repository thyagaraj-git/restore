package collections;
import java.util.*;
import java.util.TreeSet;
import java.util.Comparator;

public class Employee {
int Id;
String Name;
String Department;
double salary;

Employee(int Id,String Name,String Department,double salary)
{
	this.Id=Id;
	this.Name=Name;
	this.Department=Department;
	this.salary=salary;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [Id=" + Id + ", Name=" + Name + ", Department=" + Department + ", salary=" + salary + "]";
}

}


