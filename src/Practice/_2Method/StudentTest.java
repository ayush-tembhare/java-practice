package Practice._2Method;
public class StudentTest {
	
	public static Student getStudentData() {
		
		Student s= new Student();
		s.id=001;
		s.name="Amey";
		s.sec='A';
		s.colllegeName="GHRCEM";
		
		return s;
	}
	
	public static void main(String[] args) {
		Student s = getStudentData();
		
		System.out.println("id "+s.id+" name: "+s.name+" Sec :"+s.sec+" college "+s.colllegeName);
	}

}
