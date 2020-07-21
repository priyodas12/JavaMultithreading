package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/*1 Java Thread=1 CPU Core Thread.
* if its CPU intensive(like complex Hashcode calculation) ops then ideal pool size must be same as CPU core size.
* if its a I/O intensive task(any network call) there will be more waiting time so thread pool size must be larger as possible.
*
*
* Here fixed number of thread,and task will be collected concurrently;
* */

public class FixedTPExecution {

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
