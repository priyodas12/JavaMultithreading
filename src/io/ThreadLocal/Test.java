package io.ThreadLocal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        //SimpleRunnable simpleRunnable=new SimpleRunnable();
        //Thread t1=new Thread(simpleRunnable,"First_Thread");
        //Thread t2=new Thread(simpleRunnable,"Second_Thread");

       ThreadLocalRunnable threadLocalRunnable=new ThreadLocalRunnable();
         /*
        Thread t1=new Thread(threadLocalRunnable,"First_Thread");
        Thread t2=new Thread(threadLocalRunnable,"Second_Thread");*/

        //ExecutorService executorService= Executors.newSingleThreadExecutor();
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        executorService.submit(threadLocalRunnable);
        executorService.submit(threadLocalRunnable);
        executorService.submit(threadLocalRunnable);

        executorService.shutdown();

        /*t1.start();
        //t1.join();
        t2.start();
        //t2.join();*/
    }
}
