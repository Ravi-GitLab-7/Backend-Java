package Lamda;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Say Hello");

//        MyInter myInter = new MyInterImple() ;{
//            myInter.sayHello();
//        }
        // anonymous class we dont want to  add more class
        // if we dont use implewment interface then we use anonymous class implements interface
//        MyInter i = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInter i2 = new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("This is anonymous class2");
//            }
//        };
//        i2.sayHello();
        //using our interface with the help of lamda
            MyInter i = () -> System.out.println("First lamda runnning");
            i.sayHello();
            MyInter i2 = () -> System.out.println("Second lamda running");
            i2.sayHello();

             SumInter sumInter = (a,b) -> a+b;

        System.out.println(sumInter.sum(1,5));

       LengthInter lengthInter =  str -> str.length();
        System.out.println(lengthInter.getLength("Hello"));
    }
}
