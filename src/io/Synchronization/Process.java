package io.Synchronization;

import java.util.stream.IntStream;

public class Process {

    private int a;
    public synchronized void processor(){
        System.out.println("Starting process by "+ Thread.currentThread().getName());
        IntStream.range(0,10).forEach((i)-> {
            System.out.println(Thread.currentThread().getName()+" processing "+a++);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Ending process by "+ Thread.currentThread().getName());
    }
}
