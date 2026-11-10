//
//package StreamApi.flatMap;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class Student1 {
//    private String name;
//    private List<Integer> phoneNumbers = new ArrayList<>();
//    private List<String> nickNames = new ArrayList<>();
//
//    public Student1(String name, List<Integer> phoneNumbers,
//                    List<String> nickNames) {
//        this.name = name;
//        this.phoneNumbers = phoneNumbers;
//        this.nickNames = nickNames;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<Integer> getPhoneNumbers() {
//        return phoneNumbers;
//    }
//
//    public List<String> getNickNames() {
//        return nickNames;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", phoneNumbers=" + phoneNumbers +
//                ", nickNames=" + nickNames +
//                '}';
//    }
//}
//
//public class realTimeUseOfFlapMap {
//
//    public static void main(String[] args) {
//
//        Student1 Ravi = new Student1("Ravi", List.of(1234567890, 556457637), List.of("abhi", "raj")
//        );
//
//        Student1 Rohit = new Student1("Rohit", List.of(1234567890, 556457637), List.of("sanu", "raja")
//        );
//
//        Student1 Amit = new Student1("Amit", List.of(1234567890, 556457637), List.of("radhe", "shayam")
//        );
//
//        List<Student1> student1List = new ArrayList<>();
//
//        student1List.add(Ravi);
//        student1List.add(Rohit);
//        student1List.add(Amit);
//
//
//        //        // Input: Student
////        // Output: List<Integer>
////
////        Function<Student1, List<Integer>> funStudentToListOfInteger = new Function<Student1, List<Integer>>() {
////                    @Override
////                    public List<Integer> apply(Student1 student) {
////                        return student.getPhoneNumbers();
////                    }
////                };
////
////        List<Integer> phoneNumberListOfEachStudent = flatMap(student1List, funStudentToListOfInteger);
////        System.out.println(phoneNumberListOfEachStudent);
////    }
////
////    // Custom generic flatMap method
////    static <T, R> List<R> flatMap(List<T> inputList, Function<T, List<R>> mapper) {
////        List<R> returnList = new ArrayList<>();
////        for (T input : inputList) {
////            List<R> outputList = mapper.apply(input);
////            for (R output : outputList) {
////                returnList.add(output);
////            }
////        }
////        return returnList;
//
//
////        // now with real life exapmle
////        // Using both map() and flatMap()
////        List<Integer> finalList = student1List.stream()
////                        // Using map()
////                        .map(new Function<Student1, List<Integer>>() {
////                            @Override
////                            public List<Integer> apply(Student1 student) {
////                                return student.getPhoneNumbers();
////                            }
////                        })
////
////                        // Using flatMap()
////                        .flatMap(new Function<List<Integer>, Stream<Integer>>() {
////                            @Override
////                            public Stream<Integer> apply(List<Integer> listOfInteger) {
////                                return listOfInteger.stream();
////                            }
////                        }).collect(Collectors.toList());
////
////        System.out.println(finalList);
//

import java.util.List;

////
////        // Using only flatMap()
////        List<Integer> finalList =
////                student1List.stream()
////                        .flatMap(student -> student.getPhoneNumbers().stream())
////                        .collect(Collectors.toList());
////
////        System.out.println(finalList);
//
//
//        // Count each nickname length using flatMap and Lambda
//
//        student1List.stream()
//                .flatMap(student -> student.getNickNames().stream())
//                .forEach(nickName ->
//                        System.out.println(
//                                nickName + " = " + nickName.length()
//                        )
//                );


// Assignment 2: Get all students' nicknames
//List<String> finalList =
//        student1List.stream()
//                .flatMap(student -> student.getNickNames().stream())
//                .collect(Collectors.toList());
//
//        System.out.println("All Student Nicknames: " + finalList);
//    }
//}
