package Lamda;

public class TreeadDemo {
    public static void main(String[] args) {
            // now we add thread :Ravi
        // body Dtuff writing
        // Thread 1
        Runnable thread1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value of i: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("Ravi-Thread-1");
        t.start();


        // Thread 2
        Runnable thread2 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value of i: " + i * 2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(thread2);
        t2.setName("Ravi-Thread-2");
        t2.start();


        // Thread 3
        Runnable thread3 = () -> {
            for (int i = 0; i <= 30; i++) {

                System.out.println("Table of i: " + i * 3);

                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread(thread3);
        t3.setName("Ravi-Thread-3");
        t3.start();
    }
}