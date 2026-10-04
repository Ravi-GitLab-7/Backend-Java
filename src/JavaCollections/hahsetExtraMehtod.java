package JavaCollections;
import java.util.HashSet;

public class hahsetExtraMehtod {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2 = new java.util.HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(7);
        set1.add(3);
        //for union
//        set1.addAll(set2);
//        System.out.println( set1);
//        // for intersection
        set1.retainAll(set2);
        System.out.println( set1);
        // subset
//        set1.containsAll(set2);
//        System.out.println(set1); //[1, 2, 3, 4, 7]
      }
}
