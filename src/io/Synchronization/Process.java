package io.Synchronization;

import java.util.stream.IntStream;

public class Process {

    private static int a;
    public static synchronized void processor1(){
        System.out.println("Starting process by "+ Thread.currentThread().getName());
        IntStream.range(0,2).forEach((i)-> {
            System.out.println(Thread.currentThread().getName()+" processing "+a++);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Ending process by "+ Thread.currentThread().getName());
    }

    public static synchronized void processor2(){
        System.out.println("Starting process by "+ Thread.currentThread().getName());
        IntStream.range(0,2).forEach((i)-> {
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
