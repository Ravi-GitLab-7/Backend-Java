
package StreamApi.flatMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class test1 {
    public static void main(String[] args) {
        List<Integer> listOfInteger1 = List.of(1, 2);
        List<Integer> listOfInteger2 = List.of(1, 2, 3);
        List<Integer> listOfInteger3 = List.of(1, 2, 3, 4);
        List<List<Integer>> list = new ArrayList<>();
        list.add(listOfInteger1);
        list.add(listOfInteger2);
        list.add(listOfInteger3);
        System.out.println("Before: " + list);
        List<Integer> listOfIntegers = flatList(list);
        System.out.println("After: " + listOfIntegers);
        // another example with string
        List<String> listOfString1 = List.of("Amit Mahto");
        List<String> listOfString2 = List.of("Rohit Kumar");
        List<String> listOfString3 = List.of("Ravi Raj");
        List<List<String>> outerList = new ArrayList<>();
        outerList.add(listOfString1);
        outerList.add(listOfString2);
        outerList.add(listOfString3);
        System.out.println(outerList);
        List<String> listOfString = flatList(outerList);
        System.out.println(listOfString);
        // flatMap -> many to one
        List<String> listOfWords = List.of("Mahesh", "Amit", "Ravi", "Rohit");
        Function<String, List<String>> funStringToStringArray =
                new Function<String, List<String>>() {
                    @Override
                    public List<String> apply(String str) {
                        String[] strArray = str.split("");
                        List<String> stringList = Arrays.asList(strArray);
                        return stringList;
                    }
                };
        List<List<String>> listOfStrings = map(listOfWords, funStringToStringArray);
        System.out.println(listOfStrings);

        // Now using flatMap
        List<String> nestedList = flatMap(listOfWords, funStringToStringArray);
        System.out.println(nestedList);
    }

    // Custom map method
    static <T, R> List<R> map(
            List<T> listOfStrig,
            Function<T, R> mapperFun) {
        List<R> retunList = new ArrayList<>();
        for (T element : listOfStrig) {
            R value = mapperFun.apply(element);
            retunList.add(value);
        }
        return retunList;
    }

    // Custom flatMap method
    static <T, R> List<R> flatMap(List<T> inputList, Function<T, List<R>> mapper) {
        List<R> retunList = new ArrayList<>();
        for (T str : inputList) {
            List<R> listOfStrings = mapper.apply(str);
            for (R element : listOfStrings) {
                retunList.add(element);
            }
        }
        return retunList;
    }

    // Flattening a nested list
    static <T> List<T> flatList(List<List<T>> nestedList) {
        List<T> mergedList = new ArrayList<>();
        for (List<T> listOfInteger : nestedList) {
            for (T intValue : listOfInteger) {
                mergedList.add(intValue);
            }
        }
        return mergedList;
    }
}
