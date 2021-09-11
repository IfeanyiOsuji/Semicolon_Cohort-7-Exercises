package africa.semicolon.chapter_16;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = List.of(employees);
//        System.out.println("Complete employee list: ");
//        list.stream().forEach(System.out::println);

        //Predicate that returns true for salaries in the range of 4000 to 6000
        Predicate<Employee> fourToSixThousand = e ->e.getSalary() >=4000 && e.getSalary()<=6000;
        // Display Employees with salaries in the range $4000-$6000
// sorted into ascending order by salary
        list.stream().filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
        System.out.printf("%nFirst employee who earns $4000 - $6000 ; %n%s%n", list.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get());

        // Sorting employees by multiple fields
        //Functions for getting first and last names from an employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String>byLastName = Employee::getLastName;
        //Comparator for comparing Employees by first name and then last name
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
        //Sort employees by last name then by first name
        list.stream().sorted(lastThenFirst)
                .forEach(System.out::println);
        //sort employees in descending order by last name, then first name
        System.out.printf("%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        // grouping employees by department
        System.out.printf("%n Employees by department%n");
        Map<String, List<Employee>> groupedByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
        });

    }
}
