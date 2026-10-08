package JavaCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTable {
    public static void main(String[] args) {
//        Hashtable hashtable = new Hashtable();
        Hashtable<Integer,String> t = new Hashtable<Integer,String>();
//        Hashtable t = new Hashtable(intial capacity);
        t.put(1,"one");
        t.put(2,"two");
        t.put(3,"three");
//        t.put(null,"four");  // NullPointerException
//        t.put(4,null);  // NullPointerException
        System.out.println(t);
        System.out.println(t.get(1));
        System.out.println(t.keySet());
        System.out.println(t.values());

        for (int k :t.keySet()){
            System.out.println(k+"   "+t.get(k));
        }
        System.out.println();
        // entry specific method
        for (Map.Entry entry:t.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println();
        // iterator method
        Set set = t.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
