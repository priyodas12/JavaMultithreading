package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedTPExecution {

    public static void main(String[] args) {
        //only one Task will be saved in SynchronousQueue, and it will search free thread to execute,if not found the it will create new thread.
        //idle thread will wait up to 60 sec after that it will be killed.
        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){
            executorService.execute(new RunnableTask());
        }

        System.out.println("Thread Name:"+Thread.currentThread().getName());

        executorService.shutdown();
    }
}
