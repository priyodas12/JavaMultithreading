package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTPExecution {

    public static void main(String[] args) {
        //task will be placed in LinkedBlockingQueue
        //executable thread size is one ,best for predefined sequential task.
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for(int i=0;i<100;i++){
            executorService.execute(new Task());
        }

        System.out.println("Thread Name:"+Thread.currentThread().getName());

        executorService.shutdown();
    }
}
