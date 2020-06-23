package io.ThreadLocal;

import java.util.stream.IntStream;

public class ThreadLocalRunnable implements Runnable {

    private ThreadLocal<Counter> threadLocal=ThreadLocal.withInitial(()->new Counter());

    @Override
    public void run() {
        IntStream.range(0,5).forEach(i->{
            threadLocal.get().increment();
        });
        System.out.println(Thread.currentThread().getName()+" prints up to  "+threadLocal.get().getCount()+" separately!");
    }
}
