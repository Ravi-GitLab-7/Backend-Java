package sortingGenerics2;
import java.util.ArrayList;
import java.util.List;

interface Person<T>{
    public  void foo();
}
//class Employee implements Person<Employee> {
//    @Override
//    public void foo(){
//
//    }
//}

class Employee implements Person<SelExpEmployee> {
    @Override
    public void foo(){

    }
}
//class SelExpEmployee implements Person<SelExpEmployee> {
//    @Override
//    public void foo() {
//
//    }
class SelExpEmployee extends Employee {

}
public class Test {
    // make sure <T> is belong from same initialization
    // here extends person <x> where x can be T itself and any super type of  T
    public static  <T extends Person<? super T>> void sortEmployees(List<T> employeeList){

    }
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        Employee e2 = new Employee();
//
//        List<Employee> listOfEmployees = new ArrayList<>();
//        listOfEmployees.add(e1);
//        listOfEmployees.add(e2);
//        sortEmployees(listOfEmployees);


        // another method
        SelExpEmployee e3 = new SelExpEmployee();
        SelExpEmployee e4 = new SelExpEmployee();
        List<SelExpEmployee> selectedEmployees = new ArrayList<>();
        selectedEmployees.add(e3);
        selectedEmployees.add(e4);
        sortEmployees(selectedEmployees);
    }
}
