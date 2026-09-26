package Lamda;

public class TreeadDemo {
    public static void main(String[] args) {
        // first thread : Thread:Ravi

        Runnable thread1 =() ->{
            // this is body of thread
            // Stuff
            for(int i = 0;i<=10;i++){
                System.out.println("Value of i"+" " +i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Ravi");
        t.start();

        Runnable thread2 =() ->{
            for(int i = 0;i<=10;i++){
                System.out.println("Value of i"+ " "+ i*2);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(thread2);
        t.setName("Ravi");
        t.start();
    }
}
