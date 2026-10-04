package JavaCollections;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayStringToArrayList {
    public static void main(String[] args) {
        String [] arr = {"Ravi","Amit", "Rohit"};
        for (String s : arr){
            System.out.println(s);
        }
        // now convert arry to arrayList use some method  -> Arrays.asList()
        ArrayList al = new ArrayList(Arrays.asList(arr));

        System.out.println(al);
    }
}
