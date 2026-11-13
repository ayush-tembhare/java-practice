package Practice.Arrays;

public class ReturnEmployeeTypeArr {
    public static void main(String[] args) {
        Employee[] employees = getEmployeeArr();
        
        for (Employee e : employees) {
            System.out.println(e.getCity() +" "+ e.getId() +" "+ e.getName());
        }
    }

    public static Employee[] getEmployeeArr() {
        return new Employee[] {
            new Employee(1, "ramesh", "kharadi"),
            new Employee(2, "Tapesh", "Hinjewadi"),
            new Employee(3, "Suresh", "munbai"),
            new Employee(4, "Ganesh", "New Mumbai"),
            new Employee(5, "Vikesh", "Hydrabad")
        };
    }
}
