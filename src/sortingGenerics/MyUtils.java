package sortingGenerics;

import java.util.ArrayList;

public class MyUtils {
    public static <T>void IterateList(ArrayList<T> anyList) {
        for (T element : anyList) {
            System.out.print(element + " ");
        }
    }
}
