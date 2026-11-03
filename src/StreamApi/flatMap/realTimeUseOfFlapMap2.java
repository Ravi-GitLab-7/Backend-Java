
package StreamApi.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student1 {

    private String name;
    private List<Integer> phoneNumbers;

    public Student1(String name, List<Integer> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Student{name='" + name +
                "', phoneNumbers=" + phoneNumbers + "}";
    }
}

public class realTimeUseOfFlapMap2 {

    public static void main(String[] args) {
        // Creating Student objects
        Student1 ravi = new Student1("Ravi", List.of(1234567890, 556457637)
        );
        Student1 rohit = new Student1("Rohit", List.of(987654321, 556457638)
        );
        Student1 amit = new Student1("Amit", List.of(998877665, 667788990)
        );
        // Creating Student list

        List<Student1> student1List = new ArrayList<>();
        student1List.add(ravi);
        student1List.add(rohit);
        student1List.add(amit);

        // Function: Student -> List<Integer>
        Function<Student1, List<Integer>> studentToPhoneNumbers = Student1::getPhoneNumbers;

        // Searching using phone number

        Integer inputPhoneNumber = 1234567890;
        Student1 result = find(student1List, inputPhoneNumber, studentToPhoneNumbers
        );

        if (result != null) {
            System.out.println("Student Name: " + result.getName());
        } else {
            System.out.println("Student not found");
        }
    }

    // Generic search method

    static <T, K> T find(List<T> inputList, K searchValue, Function<T, List<K>> mapper) {

        for (T element : inputList) {
            List<K> mappedList = mapper.apply(element);
            if (mappedList.contains(searchValue)) {
                return element;
            }
        }
        return null;
    }
}
