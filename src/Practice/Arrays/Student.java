package Practice.Arrays;


public class Student {

    // Instance variables
     int id;
     String name;
     String city;

    // Parameterized constructor
    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

}