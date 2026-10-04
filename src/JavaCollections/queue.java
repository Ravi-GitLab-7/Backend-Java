package JavaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add("1");
        pq.add("2");
        pq.add("3");
        pq.add("3");
        pq.offer("2");

        System.out.println(pq);

        System.out.println(pq.element());
        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq);

        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        for (Object ele : pq){
            System.out.println(ele);
        }
    }
}
