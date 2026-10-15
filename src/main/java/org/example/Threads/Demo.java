package org.example.Threads;

class Counter{

    int count;
    public synchronized void increment(){

        count++;
    }
}

public class Demo {

    public static void main(String[] args) throws InterruptedException {
       Counter obj = new Counter();
        Runnable obj1 = () -> {
           for (int i = 1; i <= 10; i++) {
//               try {
//                   Thread.sleep(10);
//               } catch (InterruptedException e) {
//                   throw new RuntimeException(e);
//               }
             //  System.out.println("hello");
               obj.increment();
           }
       };

       Runnable obj2 =() -> {
           for (int i = 1; i <= 10; i++) {
//               try {
//                   Thread.sleep(10);
//               } catch (InterruptedException e) {
//                   throw new RuntimeException(e);
//               }
              // System.out.println("hii");
               obj.increment();
           }
       };

       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

       t1.start();

       t2.start();
       Thread.sleep(0);
//       t1.join();
//       t2.join();

        System.out.println(obj.count);
    }
}
