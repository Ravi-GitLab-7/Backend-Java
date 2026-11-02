
package StreamApi.flatMap;
import java.util.ArrayList;
import java.util.List;
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

    static List<Integer> flatList(List<List<Integer>> nestedList) {
        List<Integer> mergedList = new ArrayList<>();
        for (List<Integer> listOfInteger : nestedList) {
            for (Integer intValue : listOfInteger) {
                mergedList.add(intValue);
            }
        }
        return mergedList;
    }
}



