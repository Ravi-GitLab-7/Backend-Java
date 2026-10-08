package Generics;

public class App {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium(new GoldFish(),new GoldFish());
//        Aquarium aquarium2 = new Aquarium(new GoldFish(),new GoldFish());
        // for access
        GoldFish Fish1 = (GoldFish)aquarium.getFish1();
        GoldFish Fish2 = (GoldFish)aquarium.getFish2();
        Fish1.swim();
        Fish2.swim();
        System.out.println(Fish1+" "+Fish2);
    }
}
