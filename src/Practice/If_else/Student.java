package Practice.If_else;
import java.util.Scanner;
public class Student {

    int id;
    String name;
    float marks;

    public Student() {
        super();
    }
    public Student(int id, String name, float marks) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id of student:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name of student:");
        String name = sc.nextLine();

        System.out.println("Enter marks of student:");
        float mark = sc.nextFloat();

        Student s1 = new Student(id, name, mark);

        sc.close();

        if (s1.getMarks() >= 35) {
            System.out.println(s1.getName()
                    + " is passed with "
                    + s1.getMarks() + " marks.");

            System.out.println("Passing marks is 35.0");
        } else {
            System.out.println(s1.getName()
                    + " is failed with "
                    + s1.getMarks() + " marks.");

            System.out.println("Passing marks is 35.0");
        }
    }
}
