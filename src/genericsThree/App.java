package genericsThree;

public class App {
    // m ->1
    public static <T> T showItem(T no){
        System.out.println(no);
        return no;
    }
    // m ->2
    public static <U> void pritnItm(U[] items){
    for (U item : items){
        System.out.println(item);
    }
    }
    // m ->3
    public static<T,U> void printMultipleItem(T t,U u){
        System.out.println(t.toString());
        System.out.println(u.toString());
    }
    public static void main(String[] args) {
        // m ->1
//        Integer showItem = showItem(100);
//        String showItem2 = showItem("Ravi");
//        Character showItem3 = showItem('C');
//        Double showItem4 = showItem(100.4);
          // m ->2
//        App.pritnItm(new Integer[]{1,2,3,4,5});
//        App.pritnItm(new String[]{"a","b","c","d","e"});
        // m ->3
        App.printMultipleItem("Ravi",1234);
        App.<String,Integer>printMultipleItem("Ravi",1234);
    }
}
