import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anuj", 21, 50000));
        employees.add(new Employee("Sahil", 22, 60000));
        employees.add(new Employee("Ashish", 19, 40000));

        // Sorting by name using lambda expression
        System.out.println("Sorting by Name:");
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        System.out.println("\nSorting by Age:");
        // Sorting by age using lambda expression
        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        employees.forEach(System.out::println);

        System.out.println("\nSorting by Salary:");
        // Sorting by salary using lambda expression
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);
    }
}
