package StreamApi.methodReference6;

import StreamApi.Student;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors()); // for how much core available bydefault that is 8 that is 8 thread will create



        // sequential time
        long startTime = System.currentTimeMillis();
        getStudentList()
                .stream()
                .filter(student ->{
                    System.out.println("filter: applying filter in student: "+ student.getStudentName()+" processed by the thread: "+Thread.currentThread().getName());
                    return student.getAge()> 4;
                })
                .map(student ->{
                    System.out.println("map: applying map in student: "+student.getStudentName()+" processed by the thread: "+ Thread.currentThread().getName());
                    return student.getStudentName();
                })
                .forEach(StudentName ->{
                    System.out.println("forEach: applying forEach in student: "+StudentName+" processed by the thread: "+ Thread.currentThread().getName());
                    System.out.println(StudentName);
                });
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken by sequential stream: " + (endTime1 - startTime) + "ms");


        System.out.println("***********");

//        // paralle time
        getStudentList()
                .stream()
                .parallel()
                .filter(student ->{
                    System.out.println("filter: applying filter in student: "+ student.getStudentName()+" processed by the thread: "+Thread.currentThread().getName());
                    return student.getAge()> 4;
                })
                .map(student ->{
                    System.out.println("map: applying map in student: "+student.getStudentName()+" processed by the thread: "+ Thread.currentThread().getName());
                    return student.getStudentName();
                })
                .forEach(StudentName ->{
                    System.out.println("forEach: applying forEach in student: "+StudentName+" processed by the thread: "+ Thread.currentThread().getName());
                    System.out.println(StudentName);
                });
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential stream: " + (endTime - startTime) + "ms");


    }
    public static List<Student> getStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();
        Student ravi = new Student(1,"Ravi",12, 12345);
        Student mohan = new Student(2, "Mohan", 12, 45324);
        Student amit = new Student(3, "Amit", 12, 12234345);
        Student rohit = new Student(4, "Rohit", 12, 1223345);
        Student rohan = new Student(5, "Rohan", 12, 1256345);
        Student golu = new Student(6, "Golu", 12, 1237645);
        Student mithun = new Student(7, "Mithun", 12, 1272345);
        Student mahesh = new Student(8, "Mahesh", 12, 12214345);
        Student umesh = new Student(4, "Umesh", 12, 123445345);
        Student smriti = new Student(3, "Smriti", 12, 123554645);
        Student vivek = new Student(7, "Vivek", 12, 123345645);
        Student govinda = new Student(8, "Govinda", 12, 112352345);
        Student shubham = new Student(9, "Shubham", 12, 123476545);
        Student riya = new Student(9, "Riya", 12, 1246787345);
        Student rani = new Student(1, "Rani", 12, 1245764345);
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
