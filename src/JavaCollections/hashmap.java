package JavaCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
//        HashMap hm = new HashMap();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Ravi");
        hm.put(2,"Amit");
        hm.put(3,"Rohit");
        hm.put(4,"Chotu");
        hm.put(5,"Golu");
        hm.put(6,"Golu");
        System.out.println(hm);

        System.out.println(hm.get(6));
        System.out.println(hm.remove(6));
        System.out.println(hm);

        System.out.println(hm.isEmpty());
        System.out.println(hm);

        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        // find values individually
        //  for this methos use this: HashMap<Integer,String> hm = new HashMap<Integer,String>();
//        for (int i : hm.keySet()){
//            System.out.println(i);
//        }
          //   HashMap hm = new HashMap();
        for (Object i : hm.keySet()){
            System.out.println(i);
       }
        for (Object i : hm.values()){
            System.out.println(i);
        }

        for (Object i :hm.keySet()){
            System.out.println(i+"         "+hm.get(i));
        }

        // apart from this use entry method
        for (Map.Entry entry : hm.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println();

        // itertor method using
        Set s = hm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
