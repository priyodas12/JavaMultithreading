package io.Lock;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

class RunnableInstanceLock implements Runnable{

    ReentrantLock reentrantLock=new ReentrantLock();

    @Override
    public void run() {
        m1();
        m2();
    }

    public void m1()  {
        reentrantLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"locking");
            System.out.println(Thread.currentThread().getName()+" prints in m1 "+new Date());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"unlocking");
            reentrantLock.unlock();
        }
    }
    public void m2() {
        reentrantLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"locking");
            System.out.println(Thread.currentThread().getName()+" prints in m2 "+new Date());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"unlocking");
            reentrantLock.unlock();
        }
    }
}

public class ReentrantLockImpl {

    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableInstanceLock());
        Thread t2=new Thread(new RunnableInstanceLock());
        t1.start();
        t2.start();
    }
}
