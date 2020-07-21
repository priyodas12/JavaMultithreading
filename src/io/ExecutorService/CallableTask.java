package io.ExecutorService;

import java.util.Random;
import java.util.concurrent.Callable;

//according to generics it will return values
public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(" printed by "+Thread.currentThread().getName());
        Thread.sleep(100);
        return new Random().nextInt();
    }
}
