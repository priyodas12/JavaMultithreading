package io.ThreadLocal;

import java.util.stream.IntStream;

public class SimpleRunnable implements Runnable{

    private Counter counter=new Counter();

    @Override
    public void run() {
        IntStream.range(0,5).forEach(i->{
            counter.increment();

        });
        System.out.println(Thread.currentThread().getName()+" prints "+counter.getCount());
    }

}
