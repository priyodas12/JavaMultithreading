package io.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
*  A cached thread pool is useful when tasks submitted for processing should not wait and
*  needs to be addressed as soon as submitted. To satisfy this requirement,
*  Java creates a new thread for the submitted task if there are no thread in the pool
*  to address the task. A cached thread pool can have up to 2^32 no of threads.
*  Effectively, this pool is for short lived asynchronous tasks.
* */
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
