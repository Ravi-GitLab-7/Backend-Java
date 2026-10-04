package JavaCollections;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class iteratorMethodLinkList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("x");
        l.add("r");
        l.add("c");
        l.add("b");
        l.add("u");
        l.add("k");

        // y iterator method
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // add mul obj in linkedlist
        LinkedList l2 = new LinkedList();
        l2.addAll(l);
        System.out.println(l2);
        l2.removeAll(l2);
        // sorting ,method
        Collections.sort(l);
        System.out.println(l);
        // rverseOrder
        Collections.reverse(l);
//        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        // shuffling
        Collections.shuffle(l);
        System.out.println(l);

        l.addFirst("Ravi");
        l.addLast("Raj");
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
