package Practice._1_variable;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Alex  Adam";
		e1.id=12001;
		e1.department="HR";
		
		Employee e2=new Employee();
		e2.name=" Adam  Evas";
		e2.id=12002;
		e2.department="Finance";
		
		Employee e3=new Employee();
		e3.name="Robert King";
		e3.id=12003;
		e3.department="Testing";
		
		Employee e4=new Employee();
		e4.name="Wensday  Adam";
		e4.id=12004;
		e4.department="Devlopment";
		
		Employee.companName="Mango PVT Ltd.";
		
		System.out.println(e1.name+" "+e1.id+" "+e1.department+" "+Employee.companName);
		System.out.println(e2.name+" "+e2.id+" "+e2.department+" "+Employee.companName);
		System.out.println(e3.name+" "+e3.id+" "+e3.department+" "+Employee.companName);
		System.out.println(e4.name+" "+e4.id+" "+e4.department+" "+Employee.companName);
		
		
		
		
	}

}
