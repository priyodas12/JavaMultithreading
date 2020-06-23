package io.ThreadLocal;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        //SimpleRunnable simpleRunnable=new SimpleRunnable();
        //Thread t1=new Thread(simpleRunnable,"First_Thread");
        //Thread t2=new Thread(simpleRunnable,"Second_Thread");

        ThreadLocalRunnable threadLocalRunnable=new ThreadLocalRunnable();

        Thread t1=new Thread(threadLocalRunnable,"First_Thread");
        Thread t2=new Thread(threadLocalRunnable,"Second_Thread");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
