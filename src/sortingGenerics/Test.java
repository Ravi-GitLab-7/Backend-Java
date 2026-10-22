package sortingGenerics;

import javax.print.attribute.standard.JobHoldUntil;

//class Human{
//
//}
//class Doctor extends Human{
//
//}
//class Animal{
//
//}
//class Dog extends Animal{
//
//}
//class Bird{
//
//}



public class Test {
//    public static  <T extends Human>void printinfo(T anyObj){
//        System.out.println("Hey you are a human...");
//    }
//
//    public static void main(String[] args) {
//        printinfo(new Human());
//    }

    public static void main(String[] args) {
        // -ve integer if the current object is lesser the specified object
        System.out.println("a".compareTo("x"));
        //-ve integer
        System.out.println("b".compareTo("d"));
        // +ve integer if the current object is grater the specified object
        System.out.println("d".compareTo("a"));
        System.out.println("g".compareTo("c"));
        // 0 integer if the current object is equal the specified object
        System.out.println("d".compareTo("d"));
        System.out.println("10".compareTo("100")); // -ve intger
        System.out.println("100".compareTo("10")); // +ve intger
        System.out.println("10".compareTo("10")); // 0 intger
    }

}
