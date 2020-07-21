package io.ExecutorService;

import java.util.Random;
import java.util.concurrent.Callable;

//according to generics it will return values
public class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return new Random().nextInt();
    }
}
