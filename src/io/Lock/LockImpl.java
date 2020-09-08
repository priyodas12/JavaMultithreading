package io.Lock;

import java.util.concurrent.locks.ReentrantLock;
//explicit locking
//we can call lock and unlock as may as time required.
public class LockImpl {

    private static ReentrantLock reentrantLock=new ReentrantLock();
    private static int a=10;

    private static void accessResource(){
        reentrantLock.lock();
        try{
            //access the resource
            a=++a;
            System.out.println(a+" incremented by "+Thread.currentThread().getName());
        }
        finally {
            reentrantLock.unlock();
        }

    }

    public static void main(String[] args) {
        Thread t1= new Thread(() -> accessResource());
        Thread t2= new Thread(() -> accessResource());
        Thread t3= new Thread(() -> accessResource());
        Thread t4= new Thread(() -> accessResource());
        t1.start();
        System.out.println(a+" printed by "+Thread.currentThread().getName());
        t2.start();
        System.out.println(a+" printed by"+Thread.currentThread().getName());
        t3.start();
        System.out.println(a+" printed by"+Thread.currentThread().getName());
        t4.start();
        System.out.println(a+" printed by"+Thread.currentThread().getName());


    }
}
