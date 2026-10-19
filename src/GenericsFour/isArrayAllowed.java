package GenericsFour;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void printAnything(Animal[] animal){  // this the generics superclass
//        animal[1]  = new Cat("pushy"); // not give compile time error bc in runtime it give .ArrayStoreException error
        for (Animal animal1 : animal){
            System.out.println(animal1);
        }
    }

    // for wildcards -> ? unknow types
        // mostly use this types in wildCard
        public static void printAnything(List<?> animal){  // this the generics superclass
        for (Object animal1 : animal){
            System.out.println(animal1);
        }
    }
}



public class isArrayAllowed {
    // List<?> hand on types
    public static void findCommonElement(List<?> list1, List<?> list2) {
        list1.add(null); // when in generics we can only add null f
        for ( Object Obj :  list1 ) {
            boolean isContains = list2.contains(Obj);
            if (isContains) {
                System.out.println(Obj);
            }
        }
    }

    public static void main(String[] args) {
        // create dog Array
        Dog[] dogArray = new Dog[]{new  Dog("Tommy"), new Dog("billu")};
        Test.printAnything(dogArray);

        Cat[] catArray = new Cat[]{new  Cat("mily"), new Cat("sily")};
        Test.printAnything(catArray);

        Animal [] animal = new Cat[2];
        animal[0] = new Cat("mily");
        animal[1] = new Dog("sily"); // not give compile time error bc in runtime it give .ArrayStoreException error

        Animal [] animal1 = new Dog[]{};


//         java allowed all this method apply in generics but when i used list it is not allowed
//         now we understand why it not so we have read wildcards

        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat("milky"));
        listOfCats.add(new Cat("silky"));
        Test.printAnything(listOfCats);

        List<Cat> listOfDog = new ArrayList<>();
        listOfDog.add(new Cat("minu"));
        listOfDog.add(new Cat("sinu"));
        Test.printAnything(listOfDog);


//         may use this in wildcard rearest time used this types in wildCard
//         this use only retrive perpose

        List<?> listOfUnkmowType = new ArrayList<>();
        listOfUnkmowType = new ArrayList<Dog>();
        listOfUnkmowType = new ArrayList<Dog>();


        // rearest time used this types in wildCard
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        List<?> listOfUnknowTypes = listOfInteger;
        listOfUnknowTypes.size();
        listOfUnknowTypes.get(1);
//        listOfUnknowTypes.add(2); // not take
        Object object = listOfUnknowTypes.get(0);
        System.out.println(object);




        // List<?> hands - on
        Box<String> toxOfString = new Box<>();
        toxOfString.setValue("Hello");
        String Value =  toxOfString.getValue();

        Box<?> boxOfUnkownTypes = new Box<>();
        Object value2 = boxOfUnkownTypes.getValue();  // dont use set value


        ArrayList<Integer> listOfInteger1 = new ArrayList<>();
        listOfInteger1.add(1);
        listOfInteger1.add(2);
        listOfInteger1.add(3);

        ArrayList<Integer> listOfInteger2 = new ArrayList<>();
        listOfInteger2.add(4);
        listOfInteger2.add(5);
        listOfInteger2.add(3);

        findCommonElement(listOfInteger1, listOfInteger2);

        // now adding thwo string
        ArrayList<String> listOfString1 = new ArrayList<>();
        listOfString1.add("Ravi");
        listOfString1.add("Raj");
        listOfString1.add("Rohit");

        ArrayList<String> listOfString2 = new ArrayList<>();
        listOfString2.add("Ravi");
        listOfString2.add("Raj");
        listOfString2.add("Amit");

        findCommonElement(listOfString1, listOfString2);

    }
}
