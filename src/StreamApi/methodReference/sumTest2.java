package StreamApi.methodReference;

public class sumTest2 {
    public static void main(String[] args) {
        ISum2 isum2 = Integer::sum;
        isum2.sum(1,2);

    }
}
