package StreamApi.methodReference4;

import java.util.function.BiFunction;

public class test1 {
    public static void main(String[] args) {



        // from test 1 to 4 have 3rd types of method reference example




        String str1 = "Ravi";
        String str2 = "Raj";
        String result = str1.concat(str2);
        System.out.println(result);

        // instead of this  we can use some existing method like bifunctional method interface
        BiFunction<String,String,String> existMethodFunctionConcateFun = String::concat;
        String res = existMethodFunctionConcateFun.apply("Ravi","Raj");
        System.out.println(res);
    }
}
