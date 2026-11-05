package Practice.mock_constructor;
////2>Create an Employee class with three overloaded constructors:
//No-argument constructor
//Constructor accepting id and name
//Constructor accepting id, name, and salary
public class Employee {
	int id;
	String name;
	double salary;

	public Employee(){
		
	}
public Employee(int id,String name){
	this.id=id;
	this.name=name;
	}
public Employee(int id,String name,double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public static void main(String[] args) {
	
}
	
}
