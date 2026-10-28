package StreamApi.methodReference5;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test1 {
    public static void main(String[] args) {
        // Constructor reference with the no-argument Employee constructor.
        Supplier<Employee> employeeSupplier = Employee::new;
        Employee defaultEmployee = employeeSupplier.get();
        System.out.println(defaultEmployee);

        // Constructor reference with Employee(int, String).
        BiFunction<Integer, String, Employee> employeeFactory = Employee::new;
        Employee employee = employeeFactory.apply(1, "Ravi");
        System.out.println(employee);

        // A method reference can call println, but cannot add the prefix itself.
        Consumer<String> printLogic = System.out::println;
        printLogic.accept("Hello, method reference!");

        // To add a prefix, keep the lambda: printLogic = value ->
        // System.out.println("printing: " + value);
    }
}
