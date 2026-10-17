package genericsThree;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
    public V getValue(){
        return value;
    }
}

class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
}



public class App {
    // m ->1
    public static <T> T showItem(T no){
        System.out.println(no);
        return no;
    }
    // m ->2
    public static <U> void printItem(U[] items){
    for (U item : items){
        System.out.println(item);
    }
    }
    // m ->3
    public static<T,U> void printMultipleItem(T t,U u){
        System.out.println(t.toString());
        System.out.println(u.toString());
    }

//    public class App<T>{
//        T t;
//    }


    // another method @override
    public <T, E> void myMethod1(T t, E e){

    }

   public static <T> T myMethod2(T param1,T param2){
        return param1;
   }

    public static <T> List<T> convertArrayToCollection(T[] arrayObj, List<T> list){
        for (T objectValue : arrayObj){
            list.add(objectValue);
        }
        return list;
   }

   public static <T extends Number> double sum(T a,T b){

        return a.doubleValue() + b.doubleValue();
   }

   public static<U> void someMethod(U u){ // where U is string

   }

    public static void main(String[] args) {
        // m ->1
//        Integer showItem = showItem(100);
//        String showItem2 = showItem("Ravi");
//        Character showItem3 = showItem('C');
//        Double showItem4 = showItem(100.4);
          // m ->2
//        App.printItem(new Integer[]{1,2,3,4,5});
//        App.printItem(new String[]{"a","b","c","d","e"});
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

        new App().myMethod1(100, "Ravi");
        App.<String>myMethod2("Ravui", "Raj");
        App.<Integer>myMethod2(100,200);
        App.myMethod2("Ravui", 100); // not give error  thi is colled super type

        AbstractCollection<?> collection = App.myMethod2(new ArrayList<>(), new HashSet<>());

        Integer[] intArr = new Integer[] {10,20,20,40,50};
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        List<Integer> convertArrayToCollection= convertArrayToCollection(intArr,listOfInteger);
        System.out.println(convertArrayToCollection);
        // now convert StringIntoCollections

        String[] stringArr = new String[] {"Amit","Ravi","Rohit"};
        ArrayList<String> listOfString = new ArrayList<>();
        List<String> convertStringToCollection= convertArrayToCollection(stringArr,listOfString);
        System.out.println(convertStringToCollection);

        System.out.println(sum(10,20));
        someMethod("Ravi");

//        App<Integer> app = new App<>;
//        app.t= Integer.valueOf(100);
//        Integer intValue = app.t;
    }
}
