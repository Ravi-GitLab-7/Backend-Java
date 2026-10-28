package StreamApi.methodReference5;

import java.util.function.Supplier;

public class Test1 {
    // this for 4th method od method reference that is Referenced to the constructor
    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier = ()->{
            return new Employee();
        };
        Employee employee = employeeSupplier.get();
        System.out.println(employee);
    }
}
