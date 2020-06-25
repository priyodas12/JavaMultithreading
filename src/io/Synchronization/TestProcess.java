package io.Synchronization;

public class TestProcess {

    public static void main(String[] args) {
        ProcessThread p=new ProcessThread();

        Thread t1=new Thread(p,"Processor 1");
        Thread t2=new Thread(p,"Processor 2");

        t1.start();
        t2.start();
    }
}
