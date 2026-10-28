package StreamApi.methodReference4;

public class UpperCaseTest {
    public static void main(String[] args) {
        IUpperCase iUpperCase =  UpperCaseTest::convertStringToUpperCase;
        String uppercase = iUpperCase.convertStringToUpperCase(new UpperCaseTest(),"ravi raj");
        System.out.println(uppercase);
    }
    // this is instance method not static method
    String convertStringToUpperCase(String str){
        return str.toUpperCase();
    }
}
