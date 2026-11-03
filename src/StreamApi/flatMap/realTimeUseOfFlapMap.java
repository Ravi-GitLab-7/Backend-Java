package StreamApi.flatMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
    private String name;
    private List<Integer> phoneNumbers = new ArrayList<>();

    public Student(String name, List<Integer> phoneNumbers) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

public class realTimeUseOfFlapMap {
    public static void main(String[] args) {
        Student1 Ravi = new Student1("Ravi", List.of(1234567890, 556457637));
        Student1 Rohit = new Student1("Rohit", List.of(1234567890, 556457637));
        Student1 Amit = new Student1("Amit", List.of(1234567890, 556457637));
        List<Student1> student1List = new ArrayList<>();
        student1List.add(Ravi);
        student1List.add(Rohit);
        student1List.add(Amit);

        // Input: Student
        // Output: List<Integer>

        Function<Student1, List<Integer>> funStudentToListOfInteger = new Function<Student1, List<Integer>>() {
                    @Override
                    public List<Integer> apply(Student1 student) {
                        return student.getPhoneNumbers();
                    }
                };

        List<Integer> phoneNumberListOfEachStudent = flatMap(student1List, funStudentToListOfInteger);
        System.out.println(phoneNumberListOfEachStudent);
    }

    // Custom generic flatMap method
    static <T, R> List<R> flatMap(List<T> inputList, Function<T, List<R>> mapper) {
        List<R> returnList = new ArrayList<>();
        for (T input : inputList) {
            List<R> outputList = mapper.apply(input);
            for (R output : outputList) {
                returnList.add(output);
            }
        }
        return returnList;
    }
}
