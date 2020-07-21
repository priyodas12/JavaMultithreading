package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class FixedTPExecution {
    //1 Java Thread=1 CPU Core Thread.
    public static void main(String[] args) {
        //within the executorService it maintains a blocking queue to save tasks.all thread will process task concurrently.
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for(int i=0;i<100;i++){
            executorService.execute(new Task());
        }

        System.out.println("Thread Name:"+Thread.currentThread().getName());

        executorService.shutdown();
    }
}
