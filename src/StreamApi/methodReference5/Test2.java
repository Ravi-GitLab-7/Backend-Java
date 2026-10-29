package StreamApi.methodReference5;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test2 {
    // Stream Api and method reference combined all of them
    public static void main(String[] args) {

        // now i want to extract the stream and it convrty in employee object so use function

        Function<String, Employee> toStringEmployeeConversion = Employee::new;
//        Employee employee = toStringEmployeeConversion.apply("Ravi");
//        System.out.println(employee);


        // if i wann print only name of the employee
        Function<Employee, String> employeefn = Employee::getName;
        String name = employeefn.apply(new Employee(1, "Ravi"));
        System.out.println(name);


        List<String> stringList = List.of("Ravi", "Kumar", "Raj");

        // here use  print method
        stringList
                .stream()
                .map(Employee::new)
                .map(Employee -> {
                    Employee.setId(ThreadLocalRandom.current().nextInt(1, 20));
                    return Employee;
                })
                // if i wann print only name of the employee
                .map(Employee::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
