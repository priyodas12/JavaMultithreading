package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTPExecution {
    public static void main(String[] args) {
        //task will be stored in delay queue with the sequence of less delay object in priority position.
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(10);

        //executorService.schedule(new Task(),10, TimeUnit.SECONDS);

        for(int i=0;i<100;i++){
            //task to tun after 10 sec delay.
            executorService.schedule(new Task(),10, TimeUnit.SECONDS);
        }

        System.out.println("Thread Name:"+Thread.currentThread().getName());

        executorService.shutdown();
    }
}
