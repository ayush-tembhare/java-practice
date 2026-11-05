package Practice.Arrays;

import java.util.Scanner;

public class StudentTest {
	 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter how many students u want to add?");
     int noOfStudents = sc.nextInt();

     Student[] arr = new Student[noOfStudents];
     for (int i = 0; i < arr.length; i++) {
         System.out.println("Enter " + (i + 1) + " student id");
         int id = sc.nextInt();
         System.out.println("Enter " + (i + 1) + " student name");
         String name = sc.next();
         System.out.println("Enter " + (i + 1) + " student city");
         String city = sc.next();

         arr[i] = new Student(id, name, city);
     }

     for(Student s:arr){
         System.out.println(s.getId()+" "+s.getName()+" "+s.getCity());
     }
 }

}
