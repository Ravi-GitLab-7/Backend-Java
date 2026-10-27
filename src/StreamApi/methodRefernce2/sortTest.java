package StreamApi.methodRefernce2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,4,65,2,67,13,89,53);
        System.out.println("before sorting: "+integerList);
//        iSort isort = (list) ->{
//            Collections.sort(list);
//        };
        // now we use method reference
        // single line lamda can be replace with method reference
        iSort isort = Collections::sort;
        isort.sortAList(integerList);
        System.out.println("after sorting: "+integerList);
    }
}
