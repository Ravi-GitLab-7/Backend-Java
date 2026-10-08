package Generics;

import java.security.PrivateKey;

public class Aquarium {
    private  Object fish1;
    private Object fish2;

    // construction
    public Aquarium(Object fish1,Object fish2 ){
        this.fish1=fish1;
        this.fish2=fish2;
    }
    // for accessing
    public Object getFish1(){
        return fish1;
    }
    public Object getFish2(){
        return fish2;
    }
}
