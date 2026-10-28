package StreamApi.methodReference4;

public class Sample {
    public static void main(String[] args) {

//        // 2nd nonstatic mehtod tha is reference to an instance method of a particular object
//        // implement sum method
//        // in non static method first we create object of sample then we use sample as a in method reference method :-> that is we have to create sample then apply in method reference
//        // Sample sample = new sample(); this directly use in method reference method
//        IAddition iAddtion =new Sample()::doAdditional;
//        // invoke sum method
//        int sum = iAddtion.sum(10,20);
//        System.out.println(sum);
//    }
//    // where reference fr in main class , herre doAddition method
//    int doAdditional(int a, int b){
//        return a+b;
//    }


        // 3rd reference to an instnce method of an orbitary object of a particular object
        // it looks like static method but it's not a static it no   static
        // implement sum method
        // in non static method first we create object of sample then we use sample as a in method reference method :-> that is we have to create sample then apply in method reference
        // Sample sample = new sample(); this directly use in method reference method
        IAddition iAddtion = Sample::doAdditional;  //here it means sample==new sample() and this is the arbitory use
        // invoke sum method
        int sum = iAddtion.sum(new Sample(),10,20);
        System.out.println(sum);
    }
    // where reference fr in main class , herre doAddition method
    int doAdditional(int a, int b){
        return a+b;
    }
}
