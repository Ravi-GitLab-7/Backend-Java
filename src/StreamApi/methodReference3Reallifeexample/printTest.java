package StreamApi.methodReference3Reallifeexample;

public class printTest {
    public static void main(String[] args) {
//        IPrint iprint =(str) -> System.out.println(str);
        // method reference
//        IPrint iprint = System.out::println;

        IPrint iprint = printTest::print;
        iprint.printData("Ravi Raj");

    }
    public static String print(String str){
        System.out.println(str);
        return str;
    }
//    // if seet integer int interface then we should change integer from String
//    public static Integer print(String str){
//        System.out.println(str);
//        return 0;
//    }
}
