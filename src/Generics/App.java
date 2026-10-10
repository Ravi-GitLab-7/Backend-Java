package Generics;

public class App {
    public static void main(String[] args) {
//        Aquarium aquarium = new Aquarium(new GoldFish(),new GoldFish());
//        Aquarium aquarium2 = new Aquarium(new GoldFish(),new GoldFish());
//        // for access
//        GoldFish Fish1 = (GoldFish)aquarium.getFish1();
//        GoldFish Fish2 = (GoldFish)aquarium.getFish2();
//        Fish1.swim();
//        Fish2.swim();
//        System.out.println(Fish1+" "+Fish2);
//   // use diff parameter
//        Aquarium aquarium = new Aquarium(new GoldFish(),new Shark());
//
//        GoldFish Fish1 = (GoldFish)aquarium.getFish1();
//        GoldFish Fish2 = (GoldFish)aquarium.getFish2();  // when we compile it show Exception in thread "main" java.lang.ClassCastException: class Generics.Shark cannot be cast to class Generics.GoldFish (Generics.Shark and Generics.GoldFish are in unnamed module of loader 'app')  fdor this peroblem came java generics for solve this problem
//        at Generics.App.main(App.java:17)  / for this problem came generics in java classes, interfaces will change both of them
//        Shark Fish2 = (Shark)aquarium.getFish2();
//        System.out.println(Fish1+" "+Fish2);

        //now use generics with proper syntax
        Aquarium<GoldFish> aquarium = new Aquarium<GoldFish>(new GoldFish(),new GoldFish());
        // for access
        // no need typcst in generics
        GoldFish Fish1 =aquarium.getFish1();
        GoldFish Fish2 = aquarium.getFish2();

        System.out.println(Fish1+" "+Fish2);

        Aquarium<StarFish> starfish = new Aquarium<StarFish>(new StarFish(),new StarFish());

        //no need object
        StarFish starfish1 = starfish.getFish1();
        StarFish starfish2 = starfish.getFish2();

        System.out.println(starfish1+" "+starfish2);
         // why java allowed this raw materia;l for his code
        Aquarium aquarium2 = new Aquarium(new GoldFish(),new String("Ravi"));  // thisa the raw material it is not paramatrized
    }
}