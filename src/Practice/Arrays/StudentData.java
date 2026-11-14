package Practice.Arrays;

public class StudentData {
	int id;
	String main;
	int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public StudentData(int id, String main, int marks) {
		super();
		this.id = id;
		this.main = main;
		this.marks = marks;
	}
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
