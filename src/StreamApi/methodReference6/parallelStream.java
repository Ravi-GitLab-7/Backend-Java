package StreamApi.methodReference6;

import StreamApi.Student;

import java.util.ArrayList;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        getStudentList()
                .stream()
                .forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential stream: " + (endTime - startTime) + "ms");










    }
    public static List<Student> getStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
        Student ravi = new Student(1,"Ravi",12, 12345);
        Student mohan = new Student(2,"Ravi",12, 45324);
        Student amit = new Student(3,"Ravi",12, 12234345);
        Student rohit = new Student(4,"Ravi",12, 1223345);
        Student rohan = new Student(5,"Ravi",12, 1256345);
        Student golu = new Student(6,"Ravi",12, 1237645);
        Student mithun = new Student(7,"Ravi",12, 1272345);
        Student mahesh = new Student(8,"Ravi",12, 12214345);
        Student umesh = new Student(4,"Ravi",12, 123445345);
        Student smriti = new Student(3,"Ravi",12, 123554645);
        Student vivek = new Student(7,"Ravi",12, 123345645);
        Student govinda = new Student(8,"Ravi",12, 112352345);
        Student shubham = new Student(9,"Ravi",12, 123476545);
        Student riya = new Student(9,"Ravi",12, 1246787345);
        Student rani = new Student(1,"Ravi",12, 1245764345);
        studentList.add(ravi);
        studentList.add(mohan);
        studentList.add(amit);
        studentList.add(rohit);
        studentList.add(rohan);
        studentList.add(golu);
        studentList.add(mithun);
        studentList.add(mahesh);
        studentList.add(umesh);
        studentList.add(smriti);
        studentList.add(vivek);
        studentList.add(govinda);
        studentList.add(shubham);
        studentList.add(riya);
        studentList.add(rani);

        return (studentList);
    }
}
