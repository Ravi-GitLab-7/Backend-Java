package Generics;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
public class App {
    public static void main(String[] args) {
////        Aquarium aquarium = new Aquarium(new GoldFish(),new GoldFish());
////        Aquarium aquarium2 = new Aquarium(new GoldFish(),new GoldFish());
////        // for access
////        GoldFish Fish1 = (GoldFish)aquarium.getFish1();
////        GoldFish Fish2 = (GoldFish)aquarium.getFish2();
////        Fish1.swim();
////        Fish2.swim();
////        System.out.println(Fish1+" "+Fish2);
////   // use diff parameter
////        Aquarium aquarium = new Aquarium(new GoldFish(),new Shark());
////
////        GoldFish Fish1 = (GoldFish)aquarium.getFish1();
////        GoldFish Fish2 = (GoldFish)aquarium.getFish2();  // when we compile it show Exception in thread "main" java.lang.ClassCastException: class Generics.Shark cannot be cast to class Generics.GoldFish (Generics.Shark and Generics.GoldFish are in unnamed module of loader 'app')  fdor this peroblem came java generics for solve this problem
////        at Generics.App.main(App.java:17)  / for this problem came generics in java classes, interfaces will change both of them
////        Shark Fish2 = (Shark)aquarium.getFish2();
////        System.out.println(Fish1+" "+Fish2);
//
//        //now use generics with proper syntax
//        Aquarium<GoldFish> aquarium = new Aquarium<GoldFish>(new GoldFish(),new GoldFish());
//        // for access
//        // no need typcst in generics
//        GoldFish Fish1 =aquarium.getFish1();
//        GoldFish Fish2 = aquarium.getFish2();
//
//        System.out.println(Fish1+" "+Fish2);
//
//        Aquarium<StarFish> starfish = new Aquarium<StarFish>(new StarFish(),new StarFish());
//
//        //no need object
//        StarFish starfish1 = starfish.getFish1();
//        StarFish starfish2 = starfish.getFish2();
//
//        System.out.println(starfish1+" "+starfish2);
//         // why java allowed this raw materia;l for his code
//        Aquarium aquarium2 = new Aquarium(new GoldFish(),new String("Ravi"));  // thisa the raw material it is not paramatrized

    // use iteration methods
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Ravi");
//        al.add("Raj");
//        al.add("Amit");
//        al.add("Rohit");

//        Iterator<String> i = al.iterator();
//
//        while (i.hasNext()) {
//            String next = i.next();
//            System.out.print(next+" ");
//        }
//        System.out.println();

//        //parametrized types
//        Box<String> box = new Box<>();
////        var v = new Box<Integer>();
////        v.setValue(5);
////        System.out.println(v.getValue());
//        box.setValue("Ravi");
//        // assigned generics type object to raw type
//        Box anotherBox = box;  // reference
//        anotherBox.setValue(100); //
//        System.out.println(anotherBox.getValue());
//        String value = box.getValue();


        Box<String> box = new Box<String>();
        box.setValue("Ravi");
//        Box<Integer> anotherBox = box;//incompatible types: Generics.Box<java.lang.String> cannot be converted to Generics.Box<java.lang.Integer>
//        Integer Value = anotherBox.getValue();


        // interview question predict output
        Box<Integer> box1 = new Box<Integer>();
        Box<String> box2 = new Box<String>();
        // use type eraser concept
        System.out.println(box1.getClass().getName());//Generics.Box
        System.out.println(box2.getClass().getName());//Generics.Box
        System.out.println(box1.getClass()==box2.getClass()); //true
        System.out.println(box1.getClass().equals(box2.getClass()));  //true

        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Raj");
        al.add("Amit");
        al.add("Rohit");
        ArrayList list = al; // compile it & it will be true
        list.add(100);
        System.out.println(list);  //[Ravi, Raj, Amit, Rohit, 100]->  all r run corect code and this will happend
        System.out.println(al);  //[Ravi, Raj, Amit, Rohit, 100]
        String string = al.get(3);  // compile
        Collection collection = al;
    }
}