package io.Synchronization;

import java.util.Date;

class RunnableInstance implements Runnable{

    @Override
    public void run() {
        m1();
        m2();
    }

    public static synchronized void m1(){
        System.out.println(Thread.currentThread().getName()+" prints "+new Date());
    }
    public static synchronized void m2(){
        System.out.println(Thread.currentThread().getName()+" prints "+new Date());
    }
}
public class StaticSynchronization {

    public static void main(String[] args) {
    Thread t1=new Thread(new RunnableInstance(),"Instance 1");
    Thread t2=new Thread(new RunnableInstance(),"Instance 2");

    t1.start();
    t2.start();

    }

}
