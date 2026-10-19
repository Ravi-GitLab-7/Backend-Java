package GenericsFour;

import java.util.ArrayList;
import java.util.List;

class Animal{

}
class Cat extends Animal{
     private String catName;
     public Cat(String CatName){
         this.catName = CatName;
     }
     @Override
    public String toString(){
         return "Cat [catName=" + catName + "]";
     }
}

class Dog extends Animal {
    private String dogName;
    public Dog(String dogName){
        this.dogName = dogName;
    }
    @Override
    public String toString(){
        return "Dog [dogName=" + dogName + "]";
    }
}
class Box<T>{ // add generics
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}

public class covariance {
    public static void main(String[] args) {
//        List<Animal> al = new ArrayList<Cat>(); //why generics dont allw in covarience


        // upCasting
        Animal animal = new Animal();
        animal = new Dog("Bruno");

//        // covarient generics types are not allowed
////        List<Animal> animals = new ArrayList<Dog>();
////        List<Integer> al = new ArrayList<Number>();

        // Generic types are invariant: List<Dog> is not a subtype of List<Animal>.
        // A wildcard gives a read-only view that can safely contain any Animal subtype.
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bruno"));
        List<? extends Animal> animals = dogs;
        Animal firstAnimal = animals.get(0);

        // animals.add(new Dog("Max")); // compile error: the exact subtype is unknown

        // Why covariant generic assignments are not allowed:
        // 1st excample
        List<Integer> listOfInteger;
        List<Object> listOfObject;
        listOfInteger = new ArrayList<Integer>();
        listOfObject = new ArrayList<Object>();

//        listOfObject == (listOfObject)listOfInteger  // not eqaul bc their generics types is differ but why not is equall
        // 2nd exapmle
//        List<Integer> listOfInteger  = new  ArrayList<>();
//        List<Number> listOfNumber = listOfInteger; // not take
//        listOfInteger.add(1);
//        listOfNumber.add(2.f);
    }
}

