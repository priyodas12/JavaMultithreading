package io.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*1 Java Thread=1 CPU Core Thread.
* if its CPU intensive(like complex Hashcode calculation) ops then ideal pool size must be same as CPU core size.
* if its a I/O intensive task(any network call) there will be more waiting time so thread pool size must be larger as possible.
*
*
* Here fixed number of thread,and task will be collected concurrently;
* */

public class FixedTPExecution {

    public static void main(String[] args) {
        //within the executorService it maintains a LinkedBlockingQueue to save tasks.all thread will process task concurrently.
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        // uncomment below for executing runnable task.
        /*for(int i=0;i<100;i++){
            executorService.execute(new RunnableTask());
        }*/

        List<Future<Integer>> list=new ArrayList<>();
        for(int i=0;i<100;i++){
            //Future is like placeholder for a variable some amount of time.
            Future<Integer> future=executorService.submit(new CallableTask());
            list.add(future);
            try {
                System.out.println(list.get(i).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println(list.size());
        }

        System.out.println("Thread Name:"+Thread.currentThread().getName());

        executorService.shutdown();
    }
}
