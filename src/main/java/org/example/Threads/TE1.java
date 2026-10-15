package org.example.Threads;

public class TE1 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
