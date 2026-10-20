package GenericsFive;

import java.util.ArrayList;
import java.util.List;

class Creature{

}
class Animal extends Creature{

    public void makeSound(){
        System.out.println("Animal is making sound");
    }

}
class Cat extends Animal{

}
class Dog extends Animal{

}
class Husky  extends Dog{
}
class IndianCat extends Cat{
}

class Home<T extends Dog>{  // set animal as upperBound  nad here Tis bound with animal with extends if it unbound then creatures are aplicable and dont give any compiler error
    private T animal1;
    private T animal2;

    public Home(T animal1,T animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
    }
    public T getAnimal1(){
        // i want to call method
        animal1.makeSound(); // it only happend when i set sxtend animal if set only T it not work
        return animal1;
    }
    public T getAnimal2(){
        return animal2;
    }
}
public class sample1 {

    // upperBond wild card achieve covariance

//    public static Integer sumIntValue(List<Integer> listOfInteger){
//        int sum = 0;
//        for (Integer value :listOfInteger){
//            sum += value;
//        }
//        return sum;
//    }
    // if i have double values
//public static Double sumIntValue(List<Number> listOfNumber) {
//    double sum = 0;
//
//    for (Number value : listOfNumber) {
//        sum += value.doubleValue();
//    }
//
//    return sum;
//}

    // made covariance invarience  number bounded and this is the super class
    public static Double sumAnyValue(List<? extends Number> listOfNumbers) {
    double sum = 0;
    for (Number values : listOfNumbers) {
        sum += values.doubleValue();
    }

    return sum;
}

// if i want to use same mathod  not possible beause thiswill same method and in generics is not possible
//public static Double sumAnyValue(List< Number> listOfNumbers) {
//    double sum = 0;
//    return sum;
//}
//    public static Double sumAnyValue(List< Integer> listOfNumbers) {
//        double sum = 0;
//        return sum;
//    }
//    public static Double sumAnyValue(List<Double> listOfNumbers) {
//        double sum = 0;
//        return sum;
//    }



    public static void main(String[] args) {
        // apply upperBond and used extends keyword in generics
//        Home<Animal> animalHome = new Home<>(new Animal(),new Animal());
//        Home<Dog> dogHome = new Home<>(new Dog(),new Dog());
//        Home<Cat> catHome =new Home<>(new Cat(), new Cat());
//        Home<IndianCat> indianCatHome = new Home<>(new IndianCat(),new IndianCat());

//        IndianCat animal1 =  indianCatHome.getAnimal1(); // here find the value which want to print
//        System.out.println(animal1); // where extract the value of indianCatHome


//        Home<Dog> dogHome =new Home<>(new Dog(),new Husky()); // heterogenious class will aplied if set dog as extended
//        Dog animal2 =dogHome.getAnimal2(); // here comiler maintain typesfety

//    Home<String> intgerHome= new Home<>(new String("")),new String("");  //not aplicable
//        Home<Creature>  creturesHome = new Home<Creature>(); //not aplicable



        // upperBond wild card achieve covariance made in invarience using generics
        List<Integer> listOfInteger = new ArrayList<>(); // list<Integer> n = new
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);
        Double sumIntValue = sumAnyValue(listOfInteger);
        System.out.println(sumIntValue);

        List<Double> listOfDoubles = new ArrayList<>(); // list<Integer> n = new
        listOfDoubles.add(1.0);
        listOfDoubles.add(2.2);
        listOfDoubles.add(3.5);
        System.out.println(sumAnyValue(listOfDoubles));


        List<Number> listOfNumber = new ArrayList<>(); // list<Integer> n = new
        listOfNumber.add(1.0);
        listOfNumber.add(2.2);
        listOfNumber.add(3.5);
        System.out.println(sumAnyValue(listOfNumber));


        // if i have double vslue
//        ArrayList<Double> listOfInteger2 = new ArrayList<>();
//        listOfInteger2.add(1.0);
//        listOfInteger2.add(2.0);
//        listOfInteger2.add(3.0);
//        Double sumIntValue = sumIntValue(listOfDouble);
//        System.out.println(sumIntValue);


//
//        List<Number> listOfNumber = new ArrayList<>();
//        listOfNumber.add(1);
//        listOfNumber.add(2);
//        listOfNumber.add(3);
//        System.out.println(sumIntValue(listOfNumber));

    }
}
