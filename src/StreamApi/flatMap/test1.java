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
        List<List<Integer>> list = new ArrayList<>(); // this is the input provided for flatmap
        list.add(listOfInteger1);
        list.add(listOfInteger2);
        list.add(listOfInteger3);
        System.out.println("Before: " + list);
        List<Integer> listOfIntegers = flatList(list); // this is the output provided for flatmap
        System.out.println("After: " + listOfIntegers);

        // aother example with string
        List<String> listOfString1 = List.of("Amit Mahto");
        List<String> listOfString2 = List.of("Rohit Kumar");
        List<String> listOfString3 = List.of("Ravi Raj");

        List<List<String>> outerList = new ArrayList<>(); // this is the input provided for flatmap
        outerList.add(listOfString1);
        outerList.add(listOfString2);
        outerList.add(listOfString3);

        System.out.println(outerList); //[[Amit Mahto], [Rohit Kumar], [Ravi Raj]] nested print
        List<String> listOfString = flatList(outerList);  // this is the output provided for flatmap
        System.out.println(listOfString);

        // flapmap -> many to one

        List<String> listOfWords = List.of("Mahesh", "Amit", "Ravi", "Rohit");

        Function<String, List<String>> funStringToStringList =
                str -> Arrays.asList(str.split(""));

        List<List<String>> listOfStrings = map(listOfWords, funStringToStringList);
        System.out.println(listOfStrings);

        List<String> flattenedWords = flatMap(listOfWords, funStringToStringList);
        System.out.println(flattenedWords);
    }

    static <T, R> List<R> map(List<T> inputList, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T element : inputList) {
            result.add(mapper.apply(element));
        }
        return result;
    }

    static <T, R> List<R> flatMap(List<T> inputList, Function<T, List<R>> mapper) {
        List<R> result = new ArrayList<>();
        for (T element : inputList) {
            result.addAll(mapper.apply(element));
        }
        return result;
    }

// now i want to extract all inner list and again merge in sing list
    // from [[1, 2], [1, 2, 3], [1, 2, 3, 4]]
    // to [1, 2,1, 2, 3,1, 2, 3,]]
    // so we can use iterate for this

//        List<Integer> mergedList = new ArrayList<>();
//        for(List<Integer> listOfInteger : list){
//           for(Integer intValue : listOfInteger){
//               mergedList.add(intValue);
//           }
//        }
//        System.out.println(mergedList);   //  [1, 2, 1, 2, 3, 1, 2, 3, 4] -> that is called flattering list from all split list to made and merge single list

    static <T>List<T> flatList(List<List<T>> nestedList) {  // with the help generics we use integer and string to made it object
        List<T> mergedList = new ArrayList<>();
        for (List<T> listOfInteger : nestedList) {
            for (T intValue : listOfInteger) {
                mergedList.add(intValue);
            }
        }
        return mergedList;
    }
}


