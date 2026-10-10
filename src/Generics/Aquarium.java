package Generics;

public class Aquarium<T> {
    private  T fish1;
    private T fish2;

    // construction
    public Aquarium(T fish1,T fish2 ){
        this.fish1=fish1;
        this.fish2=fish2;
    }
    // for accessing
    public T getFish1(){
        return fish1;
    }
    public T getFish2(){
        return fish2;
    }
}
