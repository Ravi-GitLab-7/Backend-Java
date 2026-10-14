package genericsThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

class HashTable<K , V>{  // not make them static bc
    private K key;
    private V value;

    public HashTable(K key,V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V grtValue(){
        return value;
    }
}



public class App {
    // m ->1
    public static <T> T showItem(T no){
        System.out.println(no);
        return no;
    }
    // m ->2
    public static <U> void pritnItm(U[] items){
    for (U item : items){
        System.out.println(item);
    }
    }
    // m ->3
    public static<T,U> void printMultipleItem(T t,U u){
        System.out.println(t.toString());
        System.out.println(u.toString());
    }



    // another method @override
    public <T> void myMethod1(T t){

    }



    public static void main(String[] args) {
        // m ->1
//        Integer showItem = showItem(100);
//        String showItem2 = showItem("Ravi");
//        Character showItem3 = showItem('C');
//        Double showItem4 = showItem(100.4);
          // m ->2
//        App.pritnItm(new Integer[]{1,2,3,4,5});
//        App.pritnItm(new String[]{"a","b","c","d","e"});
        // m ->3
        App.printMultipleItem("Ravi",1234);
        App.<String,Integer>printMultipleItem("Ravi",1234);
        HashTable<String,Integer> hashtable1 = new HashTable<>("Ravi",123);
        String key = hashtable1.getKey();
//        Integer value = hashtable1.getValue();
//        System.out.println(key +" " + value);

        // extra method ->1
        List<String> stringList = new ArrayList<>();
        stringList.add("Ravi");
        stringList.add("Rohit");
        System.out.println(stringList);
        Collections.replaceAll(stringList,"Ravi","Amit");
        System.out.println(stringList);

        // -> 2
        List<String> stringList1 = Collections.emptyList();  // return string list
        List<Integer> stringList2 = Collections.emptyList();  // return integer list

        Object[] array = stringList.toArray();
        for (Object o : array){
            System.out.println(o);
        }
    }
}
