package Practice.Arrays;

public class StudentTeest {
	public static void main(String[] args) {
		StudentData[] s= {
				new StudentData(1,"Suresh",46),
				new StudentData(2,"ramesh",65),
				new StudentData(4,"gukesh",37),
				new StudentData(3,"hemesh",34),
				new StudentData(5,"kamlesh",26),
		};
		checkResult(s);
	}
	public static void checkResult(StudentData[] s) {
		for(int i=0;i<s.length;i++) {
			int mark = s[i].getMarks();
			if(mark>=35) {
				System.out.println(s[i].getname()+"  is passed with "+s[i].getMarks());
			}else {
				System.out.println(s[i].getname()+"  is failed with "+s[i].getMarks());
			}
		}
		
		
	}

}

