package sortingGenerics3;

//interface Person<T>{
//    public  void foo();
//}

import sortingGenerics.SortByYearComprator;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee id : " + id + " Name : " + name;
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.id > anotherEmployee.id) {
            return 1;

        } else if (this.id < anotherEmployee.id) {
            return -1;
        }
        return 0;
    }
}
class SelExpEmployee  extends Employee {

    public SelExpEmployee(int id, String name) {
        super(id, name);
    }
}
public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> intgerList = new ArrayList<>();
//        intgerList.add(1);
//        intgerList.add(3);
//        intgerList.add(2);
//
//        Collections.sort(intgerList);
//
//        System.out.println(intgerList);

//        Employee e1 = new Employee(1,"sonu");
//        Employee e2 = new Employee(3,"monu");
//        Employee e3 = new Employee(2,"golu");
//        Employee e4 = new Employee(5,"bholu");
//
//        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        employeeList.add(e4);
//
//        Collections.sort(employeeList);
//        System.out.println(employeeList);

//        SelExpEmployee e1 = new SelExpEmployee(1,"sonu");
//        SelExpEmployee e2 = new SelExpEmployee(3,"monu");
//        SelExpEmployee e3 = new SelExpEmployee(2,"golu");
//        SelExpEmployee e4 = new SelExpEmployee(5,"bholu");
//
//        ArrayList<SelExpEmployee> selExpEmployee = new ArrayList<SelExpEmployee>();
//        selExpEmployee.add(e1);
//        selExpEmployee.add(e2);
//        selExpEmployee.add(e3);
//        selExpEmployee.add(e4);
//
//        sortEmployee(selExpEmployee);
//        Collections.sort(selExpEmployee);
//        System.out.println(selExpEmployee);

        SelExpEmployee e1 = new SelExpEmployee(1,"sonu");
        SelExpEmployee e2 = new SelExpEmployee(3,"monu");
        SelExpEmployee e3 = new SelExpEmployee(2,"golu");
        SelExpEmployee e4 = new SelExpEmployee(5,"bholu");

        ArrayList<SelExpEmployee> selExpEmployee = new ArrayList<SelExpEmployee>();
        selExpEmployee.add(e1);
        selExpEmployee.add(e2);
        selExpEmployee.add(e3);
        selExpEmployee.add(e4);

        Comparator <Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                if (o1.id > o2.id) {
//                    return 1;
//                } else if (o1.id < o2.id) {
//                    return -1;
//                }
//                else return 0;
//            }
//                 we can apply this intead of previous method
                return Integer.compare(o1.id, o2.id);
            }
        };

        Collections.sort(selExpEmployee, employeeComparator);
        System.out.println(selExpEmployee);

        // another method

        List<String> stringFruitList = Arrays.asList("apple", "banana", "orange","grapes");
        Comparator<Object> objectComparator = ((o1, o2) ->  o1.toString().compareTo(o2.toString()));
        // used own comprator
        Collections.sort(stringFruitList,objectComparator);
        System.out.println(stringFruitList);

    }

    // T must be implements comparable <x> where x is T itself or any type super of C
//    public static<T extends  Comparable<? super T>> void sortEmployee(List<T> list){
//
//    }



}
