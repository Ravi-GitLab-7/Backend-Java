package JavaCollections;
import java.util.ArrayList;
import java.util.Collections;

public class addAllEle {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("x");       // String
        al.add("y");       // String
        al.add("a");       // String
        al.add("n");       // String
        ArrayList<String> al2 = new ArrayList<>();  // one group of elements add to another ArrayList
        al2.addAll(al);
        System.out.println();

        // if you want to remove all then use removeAll method
        System.out.print(al2);
        // asending order print
        Collections.sort(al);
        System.out.println(al);
        // revorse order print
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        // suffling oreder = randomly rearranges elements
        Collections.shuffle(al);
        System.out.println(al);
    }
}