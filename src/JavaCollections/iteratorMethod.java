package JavaCollections;
import java.util.ArrayList;
import java.util.Iterator;

public class iteratorMethod {
    public static void main(String[] args) {
        System.out.println("We are using iterator method");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Iterator Method");
        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()); // print element and next to element
        }
    }
}