package StreamApi.methodReference3Reallifeexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class test1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 3, 1, 2, 3);
        Consumer<List<Integer>> sortingLogic = Collections::sort;
        sortingLogic.accept(integerList);
        System.out.println(integerList);


        //another functional method in bifunctional method have all the expression apply like multiply divide etc
        BiFunction<Integer, Integer, Integer> bifunction = Integer::sum;
        Integer sum = bifunction.apply(1, 2);
        System.out.println(sum);


        // same method use multiplication all are happend in static class it has apply method
        BiFunction<Integer, Integer, Integer> mulbifunction = test1::mul;
        Integer mul = mulbifunction.apply(10,10);
        System.out.println(mul);



        // use bipredicate functional method it has test method
        BiPredicate<String,String> checkStringIsEqual = Objects::equals;
        boolean result = checkStringIsEqual.test("Ravi","Ravi");
        System.out.println(result);

        // if i use bifunctional instead of bipredicate then
        BiFunction<String,String, Boolean > checkStringIsEqual1 = Objects::equals;
        boolean result1 = checkStringIsEqual1.apply("Ravi","Ravi");
        System.out.println(result1);


        // now ome tricky can consumer have hashcode can it assing it -> yes it assign
        Consumer<test1> calculateLatestHashcodeLogic = Objects::hashCode;
        calculateLatestHashcodeLogic.accept(new test1());


        // convert uppercase as use Iuppercase interface in this class
        // this is not static method but this is run
        IUpperClass iUpperCase = String::toUpperCase;
        String reslt2 = iUpperCase.convertStringToUpperCase("ravi");
        System.out.println(reslt2);

    }
    public static int mul(int a,int b){
        return a*b;
    }
}
