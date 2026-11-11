package genericsSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class myStream<T>{
    private List<T> list;

    public myStream(List<T> list){
        this.list=list;
    }
    public <R> List<R> map(Function<? super T,? extends R> mapperFun){
        List<R> returnList = new ArrayList<>();
        for(T input:list){
            R output = mapperFun.apply(input);
            returnList.add(output);
        }
        return returnList;
    }
}
public class sample2 {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Ravi","Raj","Amit","Mahto","Rohit","Raj");
        myStream<String> MyStream= new myStream<>(listOfString);

        MyStream.map(t -> t.length())
                .forEach(count -> System.out.println(count));
    }
}
