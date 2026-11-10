package genericsSix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class Sample {
    public <T,R>List<R> map(List<T> list,Function<? super T,? extends R> mapperFun){
        List<R> returnList = new ArrayList<>();
        for(T input:list){
            R output = mapperFun.apply(input);
            returnList.add(output);
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Ravi","Amit","Rohit","Aayush","Sanjay");
        Function<CharSequence,Integer> funNumberToString = new Function<CharSequence, Integer>() {
            @Override
            public Integer apply(CharSequence t) {
                return t.length();
            }
        };

        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5);
        Function<Number,String> numberToStrinFunction= new Function<Number, String>() {
            @Override
            public String apply(Number t) {
                return "valur is: "+ t;
            }
        };


//        Function<String,Integer> stringToInteger = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String t) {
//                return t.length();
//            }
//        };
////       // knowing no. of string character then return it countable from
////       Stream<Integer> integerStream = listOfString.stream().map(stringToInteger);
////       integerStream.forEach(lengthCount -> System.out.println(lengthCount));
//
//
////        //  aprt from it we can use somthething like that  map coding()
////        List<Integer> listOfInteger= new Sample().map(listOfString,stringToInteger);
////        System.out.println(listOfInteger);
//
//        // now i print string when someone is give ntteger like input 10 ; -> the value is 10
//        List<Integer> listOfinteger = Arrays.asList(1,3,7,13,89,34,32);
//        Function<Integer,String> integrToString = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return "the value is " + integer;
//            }
//        };
//        List<String> listOfIntege1r = new Sample().map(listOfinteger,integrToString);
//        System.out.println(listOfIntege1r);
//

        // suppose we have some ? extend T  like covarient



//        List<? super Number > list = new ArrayList<>();
//        list.add(10);
//        list.add(10.0);
//        System.out.println(list);
    }
}
