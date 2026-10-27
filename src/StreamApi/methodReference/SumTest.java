package StreamApi.methodReference;

import static java.lang.Integer.sum;
public class SumTest {
    public static void main(String[] args) {

//        Isum isum = new Isum() {
//            @Override
//            public int sum(int value1, int value2) {
//                return value1 + value2;
//            }
//        };
//        int sum = sum(100, 200);
//        System.out.println("Adding two numbers: " + sum);
//
//        // Lambda expression
//        Isum isumLambdaWay = (value1, value2) -> value1 + value2;
//        int lambdaSum = isumLambdaWay.sum(10, 20);
//        System.out.println("Printing the sum by lambda: " + lambdaSum);

//        // Method reference
//        Isum isumMethodReference = SumTest::addition;  // use sumTest::addtion bc it's static method  and isumMethodReference is override Isum and then it go to the interface and then in interface like Isum have not given nay value in parameter so it goes into methodreferencemehtod which are overrid take input and then print it
//        int methodReferenceSum = isumMethodReference.sum(10, 20);
//        System.out.println("Printing the sum by method reference: " + methodReferenceSum);
//    }
//
//    public static int addition(int value1, int value2) {
//        return value1 + value2;
//    }


        //    1.>  static method reference (types of methd referernce
        //here it take beacuse sum function already present in java libries and when it call with static methos then it will not giving any error
        Isum isumStaticMethodReference = Integer::sum;
        /**  basicaaly in lamda we write same code as given in this comment line
         (a,b) ->{
         return.Integer.sum(a,b);
         };
         */
        // so with the help of method reference method we don't wroite any parameter return and also dont inisialize a,b
        int sum2 = isumStaticMethodReference.sum(10, 60);
        System.out.println("using static metrhod for printing sum: " + sum2);

        // method reference lamda by this method but always it will not go for some time it will give error like
        // method reference substitute lamda but all lamda can't substitute by method referece
        // this all are in the anotherClass that is Isort and
    }
}
